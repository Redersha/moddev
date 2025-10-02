package muliu.myfirstmod.sound;

import muliu.myfirstmod.Myfirstmod;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {
    public static final SoundEvent TEST = register("test");

    public static final SoundEvent A_MOMENT_APART_MUSIC_DISC = register("a_moment_apart_music_disc");

    public static final SoundEvent SEE_YOU_AGAIN_MUSIC_DISC = register("see_you_again_music_disc");

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(Myfirstmod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {

    }
}
