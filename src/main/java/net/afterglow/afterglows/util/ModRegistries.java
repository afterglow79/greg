package net.afterglow.afterglows.util;

import net.afterglow.afterglows.entity.client.RayRenderer;
import net.afterglow.afterglows.entity.custom.ModEntities;
import net.afterglow.afterglows.entity.custom.RayEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
        public static void registerModStuffs() {
                registerAttributes();
        }


private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.RAY, RayEntity.setAttributes());
}

}

