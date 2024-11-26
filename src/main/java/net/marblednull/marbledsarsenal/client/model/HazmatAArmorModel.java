package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatAArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HazmatAArmorModel extends GeoModel<HazmatAArmorItem> {

    @Override
    public ResourceLocation getModelResource(HazmatAArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/hazmat_a_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HazmatAArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/hazmat_a_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HazmatAArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/hazmat_armor.animation.json");
    }
}
