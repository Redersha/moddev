package muliu.myfirstmod.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.random.Random;

public class NvidiaGtx690 extends SwordItem {

    public NvidiaGtx690(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = target.getWorld();

        if (!world.isClient && attacker instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) attacker;

            double targetX = target.getX();
            double targetY = target.getY();
            double targetZ = target.getZ();


            spawnFireballs(world, target, player);


            spawnCoolParticles((ServerWorld) world, targetX, targetY, targetZ);
        }

        return super.postHit(stack, target, attacker);
    }

    private void spawnFireballs(World world, LivingEntity target, PlayerEntity player) {
    Random random = world.random;
    double spawnHeight = 10.0;
    float power = 1.0f;

    for (int i = 0; i < 3; i++) {
        double offsetX = (random.nextDouble() - 0.5) * 4.0;
        double offsetZ = (random.nextDouble() - 0.5) * 4.0;

        double fireballX = target.getX() + offsetX;
        double fireballY = target.getY() + spawnHeight;
        double fireballZ = target.getZ() + offsetZ;

        Vec3d targetPos = new Vec3d(
            target.getX(),
            target.getY() + target.getHeight() / 2.0,
            target.getZ()
        );
        Vec3d fireballPos = new Vec3d(fireballX, fireballY, fireballZ);
        Vec3d direction = targetPos.subtract(fireballPos).normalize().add(
            (random.nextDouble() - 0.5) * 0.2,
            (random.nextDouble() - 0.5) * 0.2,
            (random.nextDouble() - 0.5) * 0.2
        ).normalize();


        SmallFireballEntity fireball = new SmallFireballEntity(EntityType.SMALL_FIREBALL, world);
        fireball.setOwner(player);
        fireball.setVelocity(direction.x, direction.y, direction.z, power, 0.0f);
        fireball.refreshPositionAndAngles(fireballX, fireballY, fireballZ, 0.0f, 0.0f);

        world.spawnEntity(fireball);
    }
}

    private void spawnCoolParticles(ServerWorld world, double x, double y, double z) {
        world.spawnParticles(ParticleTypes.EXPLOSION, x, y + 1, z, 10, 0.5, 0.5, 0.5, 0.1);
        world.spawnParticles(ParticleTypes.FLAME, x, y + 1, z, 30, 0.3, 0.3, 0.3, 0.05);
        world.spawnParticles(ParticleTypes.SMOKE, x, y + 1, z, 20, 0.4, 0.4, 0.4, 0.02);
    }
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("item.myfirstmod.nvidia_gtx690.shift_tooltip"));
        } else if (Screen.hasAltDown()){
            tooltip.add(Text.translatable("item.myfirstmod.nvidia_gtx690.alt_tooltip"));
        } else if (Screen.hasControlDown()){
            tooltip.add(Text.translatable("item.myfirstmod.nvidia_gtx690.ctrl_tooltip"));
        } else {
            tooltip.add(Text.translatable("item.myfirstmod.nvidia_gtx690.tooltip"));
            tooltip.add(Text.translatable("item.myfirstmod.nvidia_gtx690.tooltip2"));
        }
    }
}