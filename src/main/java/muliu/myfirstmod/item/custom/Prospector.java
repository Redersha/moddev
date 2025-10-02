package muliu.myfirstmod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;

import java.util.List;
import net.minecraft.block.Block;

public class Prospector extends Item {

    public Prospector(Settings settings){
        super(settings);
    }
    
    @Override
    public ActionResult useOnBlock(ItemUsageContext context){
        World world = context.getWorld();
        if (!world.isClient()){
            BlockPos blockPos =context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;
            
            for(int x = blockPos.getX() - 8;x <= blockPos.getX() + 8;x++){
                for(int z = blockPos.getZ() - 8;z <= blockPos.getZ() + 8;z++){
                    for(int y = -64;y <= blockPos.getY() + 64;y++){
                        BlockPos currentPos = new BlockPos(x,y,z);
                        BlockState blockState = world.getBlockState(currentPos);
                        if(isRightBlock(blockState)){
                            outputMessage(currentPos, player, blockState.getBlock());
                            foundBlock = true;
                        }
                    }
                }
                
            }
            if (!foundBlock){
                player.sendMessage(Text.literal("No Ore Found"));
            }
        }
        context.getStack().damage(1,context.getPlayer(),
            playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
        return ActionResult.SUCCESS;
    } 
    private void outputMessage(BlockPos down,PlayerEntity player,Block block){
        player.sendMessage(Text.literal("Found"+block.asItem().getName().getString()+"at"+
        "(" + down.getX() + "," + down.getY() + "," + down.getZ() + ")"),false);
    }

    private boolean isRightBlock(BlockState state){
        return
        state.isOf(Blocks.IRON_ORE)||
        state.isOf(Blocks.GOLD_ORE)||
        state.isOf(Blocks.DIAMOND_ORE)||
        state.isOf(Blocks.EMERALD_ORE)||
        state.isOf(Blocks.COAL_ORE)||
        state.isOf(Blocks.DEEPSLATE_COAL_ORE)||
        state.isOf(Blocks.DEEPSLATE_IRON_ORE)||
        state.isOf(Blocks.DEEPSLATE_DIAMOND_ORE)||
        state.isOf(Blocks.DEEPSLATE_EMERALD_ORE)||
        state.isOf(Blocks.DEEPSLATE_GOLD_ORE);
    }
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.myfirstmod.prospector.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
