package muliu.myfirstmod.tag;

import muliu.myfirstmod.Myfirstmod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> SUGAR_INGREDIENTS = of("sugar_ingredients");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(Myfirstmod.MOD_ID, id));
    }
}
