package net.afterglow.afterglows.world.gen;

import net.afterglow.afterglows.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
        public static void generateOres() {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.HIGH_FREQUENCY_ORE_PLACED.getKey().get());
        }
    }

