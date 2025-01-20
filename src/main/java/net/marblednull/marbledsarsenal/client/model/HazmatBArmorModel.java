package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.HazmatBArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HazmatBArmorModel extends GeoModel<HazmatBArmorItem> {

    @Override
    public ResourceLocation getModelResource(HazmatBArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/hazmat_b.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HazmatBArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/hazmat_b.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HazmatBArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/hazmat_armor.animation.json");
    }
}
