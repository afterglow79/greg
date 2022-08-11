package net.afterglow.afterglows.entity.client;


import net.afterglow.afterglows.AfterglowsMod;
import net.afterglow.afterglows.entity.custom.GregoryEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GregRenderer extends GeoEntityRenderer<GregoryEntity> {
    public GregRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GregModel());
    }

    @Override
    public Identifier getTextureLocation(GregoryEntity instance) {
        return new Identifier(AfterglowsMod.MOD_ID, "textures/entity/gregory/gregtexture.png");
    }
}