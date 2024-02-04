package luhjak.customdiscs.sound;

import luhjak.customdiscs.CustomDiscs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent DISK1_AUDIO = registerSoundEvent();



    private static SoundEvent registerSoundEvent() {
        Identifier id = new Identifier(CustomDiscs.MOD_ID, "disk1_audio");
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds(){
        CustomDiscs.LOGGER.info("Registry for sounds for " + CustomDiscs.MOD_ID);
    }
}
