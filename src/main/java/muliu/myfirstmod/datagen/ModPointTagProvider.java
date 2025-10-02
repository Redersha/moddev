package muliu.myfirstmod.datagen;

import java.util.concurrent.CompletableFuture;

import muliu.myfirstmod.Myfirstmod;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.PointOfInterestTypeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;

public class ModPointTagProvider extends TagProvider<PointOfInterestType>{

    protected ModPointTagProvider(DataOutput output, CompletableFuture<WrapperLookup> registryLookupFuture) {
        super(output, RegistryKeys.POINT_OF_INTEREST_TYPE, registryLookupFuture);

    }

    @Override
    protected void configure(WrapperLookup lookup) {
        getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE)
            .addOptional(new Identifier(Myfirstmod.MOD_ID,"ice_ether_poi"));
    }



}
