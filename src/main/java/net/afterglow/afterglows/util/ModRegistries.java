package net.afterglow.afterglows.util;

import net.afterglow.afterglows.entity.custom.GregoryEntity;
import net.afterglow.afterglows.entity.custom.ModEntities;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {

    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.GREG, GregoryEntity.setAttributes());
    }
}
