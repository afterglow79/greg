package net.afterglow.afterglows.entity.client;


import net.afterglow.afterglows.AfterglowsMod;
import net.afterglow.afterglows.entity.custom.RayEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RayRenderer extends GeoEntityRenderer<RayEntity> {
    public RayRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RayModel());
    }

    @Override
    public Identifier getTextureLocation(RayEntity instance) {
        return new Identifier(AfterglowsMod.MOD_ID, "textures/entity/ray/mg_ray.png");
    }
}