package net.afterglow.afterglows.item;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.afterglow.afterglows.AfterglowsMod;
import net.afterglow.afterglows.entity.custom.ModEntities;
import net.afterglow.afterglows.item.custom.ModAxeItem;
import net.afterglow.afterglows.item.custom.ModHoeItem;
import net.afterglow.afterglows.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item HIGH_FREQUENCY_INGOT = registerItem("high_frequency_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.RR)));

    public static final Item HIGH_FREQUENCY_NUGGET = registerItem("high_frequency_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.RR)));

    public static final Item RAW_HIGH_FREQUENCY = registerItem("raw_high_frequency",
            new Item(new FabricItemSettings().group(ModItemGroup.RR)));

    public static final Item HIGH_FREQUENCY_BLADE = registerItem("high_frequency_blade",
            new SwordItem(ModToolMaterials.HIGH_FREQUENCY, 10, 6f,
                    new FabricItemSettings().group(ModItemGroup.RR)));
    public static final Item HIGH_FREQUENCY_AXE = registerItem("high_frequency_axe",
            new ModAxeItem(ModToolMaterials.HIGH_FREQUENCY, 7, 1f,
                    new FabricItemSettings().group(ModItemGroup.RR)));
    public static final Item HIGH_FREQUENCY_PICKAXE = registerItem("high_frequency_pickaxe",
            new ModPickaxeItem(ModToolMaterials.HIGH_FREQUENCY, 1, 0.1f,
                    new FabricItemSettings().group(ModItemGroup.RR)));
    public static final Item HIGH_FREQUENCY_SHOVEL = registerItem("high_frequency_shovel",
            new ShovelItem(ModToolMaterials.HIGH_FREQUENCY, 1, 0.1f,
                    new FabricItemSettings().group(ModItemGroup.RR)));
    public static final Item HIGH_FREQUENCY_HOE = registerItem("high_frequency_hoe",
            new ModHoeItem(ModToolMaterials.HIGH_FREQUENCY, 1, 0.1f,
                    new FabricItemSettings().group(ModItemGroup.RR)));

    public static final Item HIGH_FREQUENCY_HELMET = registerItem("high_frequency_helmet",
            new ArmorItem(ModArmorMaterials.HIGH_FREQUENCY, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.RR)));
    public static final Item HIGH_FREQUENCY_CHESTPLATE = registerItem("high_frequency_chestplate",
            new ArmorItem(ModArmorMaterials.HIGH_FREQUENCY, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.RR)));
    public static final Item HIGH_FREQUENCY_LEGGINGS = registerItem("high_frequency_leggings",
            new ArmorItem(ModArmorMaterials.HIGH_FREQUENCY, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.RR)));
    public static final Item HIGH_FREQUENCY_BOOTS = registerItem("high_frequency_boots",
            new ArmorItem(ModArmorMaterials.HIGH_FREQUENCY, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.RR)));

    public static final Item RAY_SPAWN_EGG = registerItem("ray_spawn_egg",
            new SpawnEggItem(ModEntities.RAY, 0x65728a, 0xC4A643,
                   new FabricItemSettings().group(ModItemGroup.RR).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AfterglowsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AfterglowsMod.LOGGER.info("Registering Mod Items for " + AfterglowsMod.MOD_ID);
    }


}

