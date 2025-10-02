package muliu.myfirstmod.datagen;

import muliu.myfirstmod.block.ModBlocks;
import muliu.myfirstmod.block.custom.HyperCornCropBlock;
import muliu.myfirstmod.block.custom.HyperStrawberryCropBlock;
import muliu.myfirstmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTablesProvider extends FabricBlockLootTableProvider {

    public ModLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ICE_ETHER_BLOCK);
        addDrop(ModBlocks.RAW_ICE_ETHER_BLOCK);
        addDrop(ModBlocks.ICE_ETHER_ORE, copperOreLikeDrops(ModBlocks.ICE_ETHER_ORE, ModItems.RAW_ICE_ETHER));

        addDrop(ModBlocks.ICE_ETHER_BUTTON);
        addDrop(ModBlocks.ICE_ETHER_STAIR);
        addDrop(ModBlocks.ICE_ETHER_FENCE);
        addDrop(ModBlocks.ICE_ETHER_FENCE_GATE);
        addDrop(ModBlocks.ICE_ETHER_PRESSURE_PLATE);
        addDrop(ModBlocks.ICE_ETHER_WALL);
        addDrop(ModBlocks.ICE_ETHER_TRAPDOOR);

        addDrop(ModBlocks.ICE_ETHER_DOOR, doorDrops(ModBlocks.ICE_ETHER_DOOR));
        addDrop(ModBlocks.ICE_ETHER_SLAB, slabDrops(ModBlocks.ICE_ETHER_SLAB));

        LootCondition.Builder builder = 
            BlockStatePropertyLootCondition.builder(ModBlocks.HYPER_STRAWBERRY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(HyperStrawberryCropBlock.AGE, 5));

        this.addDrop(ModBlocks.HYPER_STRAWBERRY_CROP,
            LootTable.builder()
                .pool(LootPool.builder()
                    .with(ItemEntry.builder(ModItems.HYPER_STRAWBERRY))
                )
                .pool(LootPool.builder()
                    .conditionally(builder)
                    .with(ItemEntry.builder(ModItems.HYPER_STRAWBERRY)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.7f, 2))
                    )
                )
        );
    


        LootCondition.Builder builder2 = 
            BlockStatePropertyLootCondition.builder(ModBlocks.HYPER_CORN_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(HyperCornCropBlock.AGE, 8));

        this.addDrop(ModBlocks.HYPER_CORN_CROP,
            LootTable.builder()
                .pool(LootPool.builder()
                    .with(ItemEntry.builder(ModItems.HYPER_CORN))
                )
                .pool(LootPool.builder()
                    .conditionally(builder2)
                    .with(ItemEntry.builder(ModItems.HYPER_CORN)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.7f, 6))
                    )
                )
        );
    
}

    public LootTable.Builder copperOreLikeDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(
                drop,
                this.applyExplosionDecay(drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE)))
        );
    }
}