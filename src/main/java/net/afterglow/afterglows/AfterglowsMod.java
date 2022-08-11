package net.afterglow.afterglows;


import net.afterglow.afterglows.item.ModItems;
import net.afterglow.afterglows.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.afterglow.afterglows.util.ModRegistries.registerAttributes;

public class AfterglowsMod implements ModInitializer {
   public static final String MOD_ID ="afterglows";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static void registerModStuffs() {
		registerAttributes();
		ModItems.registerModItems();
	}

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}
