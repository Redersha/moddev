package muliu.myfirstmod.datagen;

import muliu.myfirstmod.block.ModBlocks;
import muliu.myfirstmod.block.custom.HyperCornCropBlock;
import muliu.myfirstmod.block.custom.HyperStrawberryCropBlock;
import muliu.myfirstmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateVariant;
import net.minecraft.data.client.BlockStateVariantMap;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.data.client.VariantSettings;
import net.minecraft.data.client.VariantsBlockStateSupplier;
import net.minecraft.item.ArmorItem;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool iceEtherPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ICE_ETHER_BLOCK);
        
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ICE_ETHER_BLOCK);

        blockStateModelGenerator.registerDoor(ModBlocks.ICE_ETHER_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ICE_ETHER_TRAPDOOR);

        iceEtherPool.stairs(ModBlocks.ICE_ETHER_STAIR);
        iceEtherPool.slab(ModBlocks.ICE_ETHER_SLAB);
        iceEtherPool.button(ModBlocks.ICE_ETHER_BUTTON);
        iceEtherPool.pressurePlate(ModBlocks.ICE_ETHER_PRESSURE_PLATE);
        iceEtherPool.fence(ModBlocks.ICE_ETHER_FENCE);
        iceEtherPool.fenceGate(ModBlocks.ICE_ETHER_FENCE_GATE);
        iceEtherPool.wall(ModBlocks.ICE_ETHER_WALL);


        blockStateModelGenerator.registerCrop(ModBlocks.HYPER_STRAWBERRY_CROP, HyperStrawberryCropBlock.AGE, 0,1,2,3,4,5);


        blockStateModelGenerator.blockStateCollector
                .accept(VariantsBlockStateSupplier.create(ModBlocks.HYPER_CORN_CROP)
                                .coordinate(BlockStateVariantMap.create(HyperCornCropBlock.AGE)
                                                .register(stage -> BlockStateVariant.create()
                                                                .put(VariantSettings.MODEL,
                                                                        blockStateModelGenerator.createSubModel(ModBlocks.HYPER_CORN_CROP, "_stage" + stage,
                                                                                Models.CROSS, TextureMap::cross))
                                                )
                                )
                );
        blockStateModelGenerator.registerSimpleState(ModBlocks.BASKETBALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_ICE_ETHER,Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_ETHER,Models.GENERATED);
        itemModelGenerator.register(ModItems.HYPER_CORN,Models.GENERATED);
        itemModelGenerator.register(ModItems.HYPER_STRAWBERRY,Models.GENERATED);
        itemModelGenerator.register(ModItems.PROSPECTOR,Models.GENERATED);
        

        itemModelGenerator.register(ModItems.ICE_ETHER_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.ICE_ETHER_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.ICE_ETHER_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.ICE_ETHER_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.ICE_ETHER_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.ICE_ETHER_PICKAXE_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIECE_OF_NVIDIA_GTX690, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NVIDIA_GTX690, Models.HANDHELD);
        itemModelGenerator.register(ModItems.A_MOMENT_APART_MUSIC_DISC, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SEE_YOU_AGAIN_MUSIC_DISC, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem)ModItems.ICE_ETHER_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.ICE_ETHER_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.ICE_ETHER_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.ICE_ETHER_BOOTS);
    }
}
