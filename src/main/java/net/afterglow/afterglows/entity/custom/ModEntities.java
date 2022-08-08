package net.afterglow.afterglows.entity.custom;

import net.afterglow.afterglows.AfterglowsMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static final EntityType<RayEntity> RAY = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AfterglowsMod.MOD_ID, "ray"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RayEntity::new)
                    .dimensions(EntityDimensions.fixed(6f, 9f)).build());


}
