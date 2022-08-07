package net.afterglow.afterglows.item;

import net.afterglow.afterglows.AfterglowsMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup RR = FabricItemGroupBuilder.build(new Identifier(AfterglowsMod.MOD_ID, "redd-room"),
            () -> new ItemStack(ModItems.HIGH_FREQUENCY_INGOT));


}
