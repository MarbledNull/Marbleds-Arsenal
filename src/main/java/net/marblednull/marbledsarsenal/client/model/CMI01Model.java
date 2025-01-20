package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.CMI01ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CMI01Model extends GeoModel<CMI01ArmorItem> {

    @Override
    public ResourceLocation getModelResource(CMI01ArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/cmi01.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CMI01ArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cmi01.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CMI01ArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/cmi01.animation.json");
    }
}
