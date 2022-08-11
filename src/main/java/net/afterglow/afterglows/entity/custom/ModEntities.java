package net.afterglow.afterglows.entity.custom;

import net.afterglow.afterglows.AfterglowsMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<GregoryEntity> GREG = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AfterglowsMod.MOD_ID, "gregory"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GregoryEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());


}
