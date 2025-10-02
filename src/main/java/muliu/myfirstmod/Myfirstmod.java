package muliu.myfirstmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import muliu.myfirstmod.block.ModBlocks;
import muliu.myfirstmod.entity.ModEntities;
import muliu.myfirstmod.entity.custom.YellowShellerEntity;
import muliu.myfirstmod.item.ModItemGroup;
import muliu.myfirstmod.item.ModItems;
import muliu.myfirstmod.sound.ModSoundEvents;
import muliu.myfirstmod.villager.ModVillagers;

public class Myfirstmod implements ModInitializer , ClientModInitializer, DedicatedServerModInitializer {
    public static final String MOD_ID = "myfirstmod";


    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("Ayo Wassup!");
        System.out.println("My Fitst Mod Loaded!");
        ModItems.registerModItems();              
        ModItemGroup.registerModItemGroup();
        ModBlocks.registerModBlocks();
        ModVillagers.registerModVillagers();   
        ModSoundEvents.registerSounds();
        ModEntities.registerModEntities();
        FabricDefaultAttributeRegistry.register(ModEntities.YELLOW_SHELLER, YellowShellerEntity.createYellowShellerAttributes());
    }

    @Override
    public void onInitializeServer() {

    }

    @Override
    public void onInitializeClient() {

    }
}