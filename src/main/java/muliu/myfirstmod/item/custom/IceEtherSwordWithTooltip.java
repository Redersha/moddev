package muliu.myfirstmod.item.custom;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class IceEtherSwordWithTooltip extends SwordItem{

    public IceEtherSwordWithTooltip(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("fireproof.tooltip"));
        tooltip.add(Text.translatable("item.myfirstmod.ice_ether_sword.tooltip"));
    }

}