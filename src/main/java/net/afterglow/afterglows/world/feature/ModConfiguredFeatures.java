package net.afterglow.afterglows.world.feature;

import net.afterglow.afterglows.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_HIGH_FREQUENCY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.HIGH_FREQUENCY_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> HIGH_FREQUENCY_ORE =
            ConfiguredFeatures.register("high_frequency_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_HIGH_FREQUENCY_ORES, 9));
}
