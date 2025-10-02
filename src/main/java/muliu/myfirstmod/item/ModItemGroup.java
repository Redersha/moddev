package muliu.myfirstmod.item;

import muliu.myfirstmod.Myfirstmod;
import muliu.myfirstmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;

public class ModItemGroup {
    public static final ItemGroup FIRST_GROUP = net.minecraft.registry.Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(Myfirstmod.MOD_ID, "first_group"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.first_group"))
            .icon(() -> new ItemStack(ModItems.ICE_ETHER))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.ICE_ETHER);entries.add(ModItems.RAW_ICE_ETHER);entries.add(ModBlocks.ICE_ETHER_BLOCK);entries.add(ModBlocks.ICE_ETHER_ORE);entries.add(ModBlocks.RAW_ICE_ETHER_BLOCK);

                entries.add(ModItems.ICE_ETHER_AXE);entries.add(ModItems.ICE_ETHER_PICKAXE);entries.add(ModItems.ICE_ETHER_HOE);entries.add(ModItems.ICE_ETHER_SWORD);entries.add(ModItems.ICE_ETHER_SHOVEL);entries.add(ModItems.ICE_ETHER_PICKAXE_AXE);
                
                entries.add(ModItems.NVIDIA_GTX690);entries.add(ModItems.PIECE_OF_NVIDIA_GTX690);
                
                entries.add(ModItems.PROSPECTOR);

                entries.add(ModItems.ICE_ETHER_HELMET);entries.add(ModItems.ICE_ETHER_CHESTPLATE);entries.add(ModItems.ICE_ETHER_LEGGINGS);entries.add(ModItems.ICE_ETHER_BOOTS);

                entries.add(ModItems.HYPER_CORN);entries.add(ModItems.HYPER_STRAWBERRY);entries.add(ModItems.HYPER_STRAWBERRY_SEEDS);

                entries.add(ModBlocks.ICE_ETHER_BUTTON);entries.add(ModBlocks.ICE_ETHER_DOOR);entries.add(ModBlocks.ICE_ETHER_FENCE);entries.add(ModBlocks.ICE_ETHER_FENCE_GATE);entries.add(ModBlocks.ICE_ETHER_SLAB);entries.add(ModBlocks.ICE_ETHER_STAIR);entries.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE);entries.add(ModBlocks.ICE_ETHER_WALL);entries.add(ModBlocks.ICE_ETHER_TRAPDOOR);
                
                entries.add(ModBlocks.BASKETBALL);
                
            }).build()

    );

    public static final ItemGroup MUSIC_DISCS = net.minecraft.registry.Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(Myfirstmod.MOD_ID, "music_discs"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.music_discs"))
            .icon(() -> new ItemStack(ModItems.A_MOMENT_APART_MUSIC_DISC))
            .entries((displayContext, entries) -> {
                
                entries.add(ModItems.A_MOMENT_APART_MUSIC_DISC);
                entries.add(ModItems.SEE_YOU_AGAIN_MUSIC_DISC);
            }).build()

    );

            
    public static void registerModItemGroup() {
    }
}