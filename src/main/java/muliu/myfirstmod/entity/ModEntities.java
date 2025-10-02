package muliu.myfirstmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import muliu.myfirstmod.Myfirstmod;
import muliu.myfirstmod.entity.custom.YellowShellerEntity;

public class ModEntities {
    public static final EntityType<YellowShellerEntity> YELLOW_SHELLER =
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, YellowShellerEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f))
                    .build();

    public static void registerModEntities() {
        Registry.register(Registries.ENTITY_TYPE, new Identifier(Myfirstmod.MOD_ID, "yellow_sheller"), YELLOW_SHELLER);
    }
}