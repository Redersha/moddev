package muliu.myfirstmod.datagen;

import muliu.myfirstmod.block.ModBlocks;
import muliu.myfirstmod.tag.ModBlockTags;
import muliu.myfirstmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider{

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.PROSPECTOR_LIST)
            .add(ModBlocks.ICE_ETHER_ORE)
            .forceAddTag(BlockTags.COAL_ORES)
            .forceAddTag(BlockTags.IRON_ORES)
            .forceAddTag(BlockTags.GOLD_ORES)
            .forceAddTag(BlockTags.LAPIS_ORES)
            .forceAddTag(BlockTags.DIAMOND_ORES)
            .forceAddTag(BlockTags.REDSTONE_ORES)
            .forceAddTag(BlockTags.EMERALD_ORES)
            .forceAddTag(BlockTags.COPPER_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.ICE_ETHER_ORE)
            .add(ModBlocks.ICE_ETHER_BLOCK)
            .add(ModBlocks.RAW_ICE_ETHER_BLOCK);
        
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.ICE_ETHER_ORE)
            .add(ModBlocks.ICE_ETHER_BLOCK)
            .add(ModBlocks.RAW_ICE_ETHER_BLOCK);

        getOrCreateTagBuilder(BlockTags.FENCES)
            .add(ModBlocks.ICE_ETHER_FENCE);
        
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(ModBlocks.ICE_ETHER_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(ModBlocks.ICE_ETHER_WALL);

        getOrCreateTagBuilder(ModBlockTags.ICE_ETHER_PICKAXE_AXE)
            .forceAddTag(BlockTags.AXE_MINEABLE)
            .forceAddTag(BlockTags.PICKAXE_MINEABLE);
    }
}