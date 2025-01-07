package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.RespiratorArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RespiratorArmorModel extends GeoModel<RespiratorArmorItem> {

    @Override
    public ResourceLocation getModelResource(RespiratorArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/respirator.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RespiratorArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/respirator.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RespiratorArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/respirator.animation.json");
    }
}
