package muliu.myfirstmod.item;

import muliu.myfirstmod.Myfirstmod;
import muliu.myfirstmod.block.ModBlocks;
import muliu.myfirstmod.item.custom.IceEtherAxeWithTooltip;
import muliu.myfirstmod.item.custom.IceEtherHoeWithTooltip;
import muliu.myfirstmod.item.custom.IceEtherPickaxeWithTooltip;
import muliu.myfirstmod.item.custom.IceEtherShovelWithTooltip;
import muliu.myfirstmod.item.custom.IceEtherSwordWithTooltip;
import muliu.myfirstmod.item.custom.ModArmorItem;
import muliu.myfirstmod.item.custom.PickaxeAxeItem;
import muliu.myfirstmod.item.custom.PieceOfNvidiaGtx690WithTooltip;
import muliu.myfirstmod.item.custom.Prospector;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registry;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import muliu.myfirstmod.sound.ModSoundEvents;

public class ModItems {
    public static final Item ICE_ETHER = registerItems("ice_ether",new Item(new FabricItemSettings()));
    public static final Item RAW_ICE_ETHER = registerItems("raw_ice_ether", new Item(new FabricItemSettings()));
    public static final Item PROSPECTOR = registerItems("prospector",new Prospector(new FabricItemSettings()));
    public static final Item HYPER_CORN = registerItems("hyper_corn",new AliasedBlockItem(ModBlocks.HYPER_CORN_CROP, new Item.Settings().food(ModFoodComponents.HYPER_CORN)));
    public static final Item HYPER_STRAWBERRY = registerItems("hyper_strawberry",new Item(new Item.Settings().food(ModFoodComponents.HYPER_STRAWBERRY)));
    public static final Item HYPER_STRAWBERRY_SEEDS = registerItems("hyper_strawberry_seeds", new AliasedBlockItem(ModBlocks.HYPER_STRAWBERRY_CROP, new Item.Settings()));
    
    public static final Item NVIDIA_GTX690 = registerItems("nvidia_gtx690", 
        new NvidiaGtx690(ModToolMaterials.GTX690, 
        1000, 
        -4f, 
        new FabricItemSettings().fireproof()
        )
    );

    public static final Item A_MOMENT_APART_MUSIC_DISC = registerItems("a_moment_apart_music_disc", 
        new MusicDiscItem(15, ModSoundEvents.A_MOMENT_APART_MUSIC_DISC, new Item.Settings().maxCount(1), 234));

    public static final Item SEE_YOU_AGAIN_MUSIC_DISC = registerItems("see_you_again_music_disc", 
        new MusicDiscItem(15, ModSoundEvents.SEE_YOU_AGAIN_MUSIC_DISC, new Item.Settings().maxCount(1), 228));

    public static final Item PIECE_OF_NVIDIA_GTX690 = registerItems("piece_of_nvidia_gtx690", new PieceOfNvidiaGtx690WithTooltip(new FabricItemSettings()));

    public static final Item ICE_ETHER_HELMET = registerItems("ice_ether_helmet",
        new ModArmorItem(ModArmorMaterial.ICE_ETHER,ArmorItem.Type.HELMET,new FabricItemSettings()));

    public static final Item ICE_ETHER_CHESTPLATE = registerItems("ice_ether_chestplate",
        new ModArmorItem(ModArmorMaterial.ICE_ETHER,ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));

    public static final Item ICE_ETHER_LEGGINGS = registerItems("ice_ether_leggings",
        new ModArmorItem(ModArmorMaterial.ICE_ETHER,ArmorItem.Type.LEGGINGS,new FabricItemSettings()));

    public static final Item ICE_ETHER_BOOTS = registerItems("ice_ether_boots",
        new ModArmorItem(ModArmorMaterial.ICE_ETHER,ArmorItem.Type.BOOTS,new FabricItemSettings()));
    

    public static final Item ICE_ETHER_PICKAXE = registerItems("ice_ether_pickaxe",
        new IceEtherPickaxeWithTooltip(ModToolMaterial.ICE_ETHER,2,2f,new FabricItemSettings().fireproof()));
    
    public static final Item ICE_ETHER_AXE = registerItems("ice_ether_axe",
        new IceEtherAxeWithTooltip(ModToolMaterial.ICE_ETHER,10,2f,new FabricItemSettings().fireproof()));
    
    public static final Item ICE_ETHER_SHOVEL = registerItems("ice_ether_shovel",
        new IceEtherShovelWithTooltip(ModToolMaterial.ICE_ETHER,2,2f,new FabricItemSettings().fireproof()));
    
    public static final Item ICE_ETHER_SWORD = registerItems("ice_ether_sword",
        new IceEtherSwordWithTooltip(ModToolMaterial.ICE_ETHER,7,3f,new FabricItemSettings().fireproof()));
    
    public static final Item ICE_ETHER_HOE = registerItems("ice_ether_hoe",
        new IceEtherHoeWithTooltip(ModToolMaterial.ICE_ETHER,1,1f,new FabricItemSettings().fireproof()));
    
    public static final Item ICE_ETHER_PICKAXE_AXE = registerItems("ice_ether_pickaxe_axe", new PickaxeAxeItem(
        ModToolMaterial.ICE_ETHER, 10.0F, -2.0F, new Item.Settings()));
    
    
    private static void addItemsToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ICE_ETHER);
        fabricItemGroupEntries.add(RAW_ICE_ETHER);
        fabricItemGroupEntries.add(HYPER_CORN);
        fabricItemGroupEntries.add(ICE_ETHER_AXE);  
        fabricItemGroupEntries.add(ICE_ETHER_PICKAXE);
        fabricItemGroupEntries.add(ICE_ETHER_SHOVEL);
        fabricItemGroupEntries.add(ICE_ETHER_SWORD);
        fabricItemGroupEntries.add(ICE_ETHER_HOE);
    }

    private static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(Myfirstmod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIG);
    }
}
