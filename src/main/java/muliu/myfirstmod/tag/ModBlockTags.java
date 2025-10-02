package muliu.myfirstmod.tag;

import muliu.myfirstmod.Myfirstmod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> ETHER_BLOCK = of("ether_block");

    public static final TagKey<Block> ICE_ETHER_PICKAXE_AXE = of("ice_ether_pickaxe_axe");
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(Myfirstmod.MOD_ID, id));
    }
}
