package muliu.myfirstmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;
import java.util.List;


import muliu.myfirstmod.block.ModBlocks;
import muliu.myfirstmod.item.ModItems;

public class ModRecipesProvider extends FabricRecipeProvider{

    private static final List<ItemConvertible> ICE_ETHER_LIST =List.of(ModItems.RAW_ICE_ETHER);

    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ICE_ETHER, 
            RecipeCategory.BUILDING_BLOCKS,ModBlocks.ICE_ETHER_BLOCK);
    
        offerSmelting(exporter, ICE_ETHER_LIST, RecipeCategory.MISC, ModItems.ICE_ETHER,
         0.7f, 200, "ice_ether");
        offerBlasting(exporter, ICE_ETHER_LIST, RecipeCategory.MISC, ModItems.ICE_ETHER,
         0.7f, 100, "ice_ether");
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR,3)
                .pattern("###")
                .input('#',Items.BEETROOT)
                .criterion(hasItem(Items.BEETROOT),conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter,new Identifier("sugar_from_beetroot"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_DOOR,3)
                .pattern("## ")
                .pattern("## ")
                .pattern("## ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_door_form_ice_ether_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_TRAPDOOR,2)
                .pattern("   ")
                .pattern("###")
                .pattern("###")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_trapdoor_form_ice_ether_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ICE_ETHER_BUTTON, 1)
                .input(ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK), conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_block_to_ice_ether_button"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_FENCE,3)
                .pattern("   ")
                .pattern("#X#")
                .pattern("#X#")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .input('X',Items.STICK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_fence_form_ice_ether_block_and_stick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_FENCE_GATE,1)
                .pattern("   ")
                .pattern("X#X")
                .pattern("X#X")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .input('X',Items.STICK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_fence_gate_form_ice_ether_stick_and_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_STAIR,4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_stair_form_ice_ether_block"));
                
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_SLAB,6)
                .pattern("   ")
                .pattern("   ")
                .pattern("###")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_slab_form_ice_ether_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_WALL,6)
                .pattern("   ")
                .pattern("###")
                .pattern("# #")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_wall_form_ice_ether_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_AXE,1)
                .pattern(" ##")
                .pattern(" X#")
                .pattern(" X ")
                .input('X',Items.STICK)
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_AXE,1)
                .pattern("## ")
                .pattern("#X ")
                .pattern(" X ")
                .input('X',Items.STICK)
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_axe_type2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_PICKAXE,1)
                .pattern("###")
                .pattern(" X ")
                .pattern(" X ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .input('X',Items.STICK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_pickaxe"));
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_SHOVEL,1)
                .pattern(" # ")
                .pattern(" X ")
                .pattern(" X ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .input('X',Items.STICK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_SWORD,1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" X ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .input('X',Items.STICK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_HOE,1)
                .pattern(" ##")
                .pattern(" X ")
                .pattern(" X ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .input('X',Items.STICK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_HOE,1)
                .pattern("## ")
                .pattern(" X ")
                .pattern(" X ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .input('X',Items.STICK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_hoe_type2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_HELMET,1)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_helmet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_HELMET,1)
                .pattern("   ")
                .pattern("###")
                .pattern("# #")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_helmet_type2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_CHESTPLATE,1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_chestplate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_LEGGINGS,1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_leggings"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_BOOTS,1)
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_BOOTS,1)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_boots_type2"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NVIDIA_GTX690, 1)
                .input(ModItems.PIECE_OF_NVIDIA_GTX690)
                .input(Items.GOLD_NUGGET)
                .input(Items.IRON_NUGGET)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK), conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("gtx690_piece_to_nvidia_gtx690"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ICE_ETHER_PICKAXE_AXE,1)
                .pattern("###")
                .pattern("#X ")
                .pattern(" X ")
                .input('#',ModBlocks.ICE_ETHER_BLOCK)
                .input('X',Items.STICK)
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK),conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter,new Identifier("ice_ether_pickaxe_axe"));

        /*ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.BASKETBALL,1)
                .pattern("#X#")
                .pattern("X X")
                .pattern("#X#")
                .input('#',Items.ORANGE_DYE)
                .input('X',Items.LEATHER)
                .criterion(hasItem(Items.LEATHER),conditionsFromItem(Items.LEATHER))
                .offerTo(exporter,new Identifier("basketball"));
        
                */
    }

}
