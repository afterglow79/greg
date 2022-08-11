package net.afterglow.afterglows;

import net.afterglow.afterglows.entity.client.GregRenderer;
import net.afterglow.afterglows.entity.custom.ModEntities;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AfterglowsClientMod {
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.GREG, GregRenderer::new);
    }
}
