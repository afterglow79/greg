package net.afterglow.afterglows.entity.client;

import net.afterglow.afterglows.AfterglowsMod;
import net.afterglow.afterglows.entity.custom.GregoryEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class GregModel extends AnimatedGeoModel<GregoryEntity> {
    @Override
    public Identifier getModelLocation(GregoryEntity object) {
        return new Identifier(AfterglowsMod.MOD_ID, "geo/gregory.geo.json");
    }

    @Override
    public Identifier getTextureLocation(GregoryEntity object) {
        return new Identifier(AfterglowsMod.MOD_ID, "textures/entity/gregory/gregtexture.png");
    }

    @Override
    public Identifier getAnimationFileLocation(GregoryEntity animatable) {
        return new Identifier(AfterglowsMod.MOD_ID, "animations/gregory.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(GregoryEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}

