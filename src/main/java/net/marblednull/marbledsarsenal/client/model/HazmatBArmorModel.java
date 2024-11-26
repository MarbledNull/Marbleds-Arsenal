package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatAArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatBArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HazmatBArmorModel extends GeoModel<HazmatBArmorItem> {

    @Override
    public ResourceLocation getModelResource(HazmatBArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/hazmat_b_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HazmatBArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/hazmat_b_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HazmatBArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/hazmat_armor.animation.json");
    }
}
