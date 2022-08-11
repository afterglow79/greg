package net.afterglow.afterglows.sound;

import net.afterglow.afterglows.AfterglowsMod;
import net.minecraft.client.sound.Sound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModSounds {
    public static SoundEvent ENTITY_GREGORY_AMBIENT = registerSoundEvent("entity_gregory_ambient");




    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(AfterglowsMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}

