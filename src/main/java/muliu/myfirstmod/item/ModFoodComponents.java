package muliu.myfirstmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent HYPER_CORN = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f)
    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,1000), 1f)
    .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,1000), 1f)
    .build();
    

    public static final FoodComponent HYPER_STRAWBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(1f)
    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,500), 1f)
    .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,500), 1f)
    .build();
}
