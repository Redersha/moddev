package muliu.myfirstmod.item.custom;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class PieceOfNvidiaGtx690WithTooltip extends Item{

    public PieceOfNvidiaGtx690WithTooltip(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.myfirstmod.piece_of_nvidia_gtx690.tooltip"));
    }
}
