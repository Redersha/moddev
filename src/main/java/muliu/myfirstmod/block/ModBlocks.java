package muliu.myfirstmod.block;

import muliu.myfirstmod.Myfirstmod;
import muliu.myfirstmod.block.custom.HyperCornCropBlock;
import muliu.myfirstmod.block.custom.HyperStrawberryCropBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
     public static final Block ICE_ETHER_BLOCK = registerBlocks("ice_ether_block",
          new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
     public static final Block RAW_ICE_ETHER_BLOCK = registerBlocks("raw_ice_ether_block",
          new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
     public static final Block ICE_ETHER_ORE = registerBlocks("ice_ether_ore",
               new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(5f),UniformIntProvider.create(2,5)));      
     public static final Block ICE_ETHER_STAIR = registerBlocks("ice_ether_stair",
          new StairsBlock(ModBlocks.ICE_ETHER_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE)));
     public static final Block ICE_ETHER_SLAB = registerBlocks("ice_ether_slab",
          new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

     public static final Block ICE_ETHER_BUTTON = registerBlocks("ice_ether_button",
          new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.STONE,20,true));

     public static final Block ICE_ETHER_PRESSURE_PLATE = registerBlocks("ice_ether_pressure_plate",
          new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
               FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.STONE));

     public static final Block ICE_ETHER_FENCE = registerBlocks("ice_ether_fence",
          new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

     public static final Block ICE_ETHER_FENCE_GATE = registerBlocks("ice_ether_fence_gate",
          new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.STONE),WoodType.OAK));

     public static final Block ICE_ETHER_WALL = registerBlocks("ice_ether_wall",
          new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

     public static final Block ICE_ETHER_DOOR = registerBlocks("ice_ether_door",
          new DoorBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque(),BlockSetType.STONE));

     public static final Block ICE_ETHER_TRAPDOOR = registerBlocks("ice_ether_trapdoor",
         new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque(),BlockSetType.STONE));

     public static final Block HYPER_STRAWBERRY_CROP = Registry.register(Registries.BLOCK, new Identifier(Myfirstmod.MOD_ID, "hyper_strawberry_crop"),
          new HyperStrawberryCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

     public static final Block HYPER_CORN_CROP = Registry.register(Registries.BLOCK, new Identifier(Myfirstmod.MOD_ID, "hyper_corn_crop"), 
          new HyperCornCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

     public static final Block BASKETBALL = register("basketball", new Block(AbstractBlock.Settings.create().strength(2.0f,6.0f).nonOpaque()));

     private static Block registerBlocks(String name,Block block){
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(Myfirstmod.MOD_ID,name),block);
     }

     private static Block register(String id, Block block) {
          registerBlockItems(id, block);
          return Registry.register(Registries.BLOCK, new Identifier(Myfirstmod.MOD_ID,id), block);
     }

     private static Item registerBlockItems(String name,Block block){
        return Registry.register(Registries.ITEM,new Identifier(Myfirstmod.MOD_ID,name),
            new BlockItem(block, new FabricItemSettings()));
     }

     public static void registerModBlocks(){

     }
}
