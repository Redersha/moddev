package muliu.myfirstmod.villager;

import muliu.myfirstmod.Myfirstmod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;

public class ModPointOfInterestTypes {
    public static final RegistryKey<PointOfInterestType> ICE_ETHER_KEY = of("ice_ether_poi");
    private static RegistryKey<PointOfInterestType> of (String id){
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE,new Identifier(Myfirstmod.MOD_ID,id));
    }

}
           