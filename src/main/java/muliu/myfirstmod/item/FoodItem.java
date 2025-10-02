package muliu.myfirstmod.item;

import java.util.List;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class FoodItem extends Item{
    public FoodItem(Settings settings){
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack,World world,List<Text> tooltip, TooltipContext context){
        tooltip.add(Text.translatable("item.myfirstmod.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
