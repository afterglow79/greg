package net.afterglow.afterglows;

import net.afterglow.afterglows.block.ModBlocks;
import net.afterglow.afterglows.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfterglowsMod implements ModInitializer {
   public static final String MOD_ID ="afterglows";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
