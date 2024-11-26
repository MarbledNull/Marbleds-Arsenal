package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatAArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatCArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HazmatCArmorModel extends GeoModel<HazmatCArmorItem> {

    @Override
    public ResourceLocation getModelResource(HazmatCArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/hazmat_c_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HazmatCArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/hazmat_c_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HazmatCArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/hazmat_armor.animation.json");
    }
}
