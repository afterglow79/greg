package net.afterglow.afterglows.item;

import net.afterglow.afterglows.entity.custom.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;

import static software.bernie.example.registry.RegistryUtils.registerItem;

public class ModItems {
    public static final Item GREGORY_SPAWN_EGG = registerItem("greg_spawn_egg",
            new SpawnEggItem(ModEntities.GREG, 0x2d3566, 0x000000,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static void registerModItems() {
    }
}
