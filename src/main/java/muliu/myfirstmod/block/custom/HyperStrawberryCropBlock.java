package muliu.myfirstmod.block.custom;

import muliu.myfirstmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class HyperStrawberryCropBlock extends CropBlock{
    public static final int MAX_AGE = 5;
    public static final IntProperty AGE = Properties.AGE_5;
    
    public HyperStrawberryCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {

        return MAX_AGE;
    }
    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }
    @Override
    public int getAge(BlockState state) {
        return state.get(this.getAgeProperty());
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.HYPER_STRAWBERRY_SEEDS;
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.FARMLAND) || floor.isIn(BlockTags.DIRT);
    }
}
