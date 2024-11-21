package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HazmatArmorModel extends GeoModel<HazmatArmorItem> {

    @Override
    public ResourceLocation getModelResource(HazmatArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/hazmat_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HazmatArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/hazmat_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HazmatArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/hazmat_armor.animation.json");
    }
}
