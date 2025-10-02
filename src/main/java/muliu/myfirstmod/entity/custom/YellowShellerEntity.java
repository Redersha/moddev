package muliu.myfirstmod.entity.custom;

import muliu.myfirstmod.entity.ModEntities;
import muliu.myfirstmod.item.ModItems;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class YellowShellerEntity extends AnimalEntity {
    public final AnimationState standUpAnimationState = new AnimationState();
    private int standUpAnimationTimeOut = 0;
    private void setUpAnimationState(){
        if(this.standUpAnimationTimeOut <=0){
            this.standUpAnimationTimeOut = this.random.nextInt(40)+80;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()){
            setUpAnimationState();
        }
    }

        

    public YellowShellerEntity(EntityType<? extends YellowShellerEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new AnimalMateGoal(this, 1.0D));
        this.goalSelector.add(2, new TemptGoal(this, 1.25D, Ingredient.ofItems(Items.BONE_MEAL), false));
        this.goalSelector.add(3, new FollowParentGoal(this, 1.0D));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 5.0D));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 9f));
        this.goalSelector.add(6, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createYellowShellerAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 40)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1F)
                .add(EntityAttributes.GENERIC_ARMOR, 0.9F)
                .add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, 20.0F)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(ModItems.HYPER_STRAWBERRY); // 确保 ModItems.HYPER_STRAWBERRY 已注册
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.YELLOW_SHELLER != null 
            ? ModEntities.YELLOW_SHELLER.create(world) 
            : null;
    }
}