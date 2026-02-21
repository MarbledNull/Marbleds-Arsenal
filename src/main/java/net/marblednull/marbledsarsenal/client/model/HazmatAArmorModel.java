package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.HazmatAArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HazmatAArmorModel extends GeoModel<HazmatAArmorItem> {

    @Override
    public ResourceLocation getModelResource(HazmatAArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/hazmat_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HazmatAArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/hazmat_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HazmatAArmorItem animatable) {
        return null;
    }
}
