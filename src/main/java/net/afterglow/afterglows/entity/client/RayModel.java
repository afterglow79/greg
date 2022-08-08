package net.afterglow.afterglows.entity.client;

import net.afterglow.afterglows.AfterglowsMod;
import net.afterglow.afterglows.entity.custom.RayEntity;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class RayModel extends AnimatedGeoModel<RayEntity> {
    @Override
    public Identifier getModelLocation(RayEntity object) {
        return new Identifier(AfterglowsMod.MOD_ID, "geo/mg_ray.geo.json");
    }

    @Override
    public Identifier getTextureLocation(RayEntity object) {
        return new Identifier(AfterglowsMod.MOD_ID, "textures/entity/ray/mg_ray.png");
    }

    @Override
    public Identifier getAnimationFileLocation(RayEntity animatable) {
        return new Identifier(AfterglowsMod.MOD_ID, "animations/mg_ray.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(RayEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}

