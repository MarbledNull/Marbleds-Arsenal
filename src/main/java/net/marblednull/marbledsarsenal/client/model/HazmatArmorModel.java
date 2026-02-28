package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.HazmatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HazmatArmorModel extends AnimatedGeoModel<HazmatArmorItem> {
    @Override
    public ResourceLocation getModelLocation(HazmatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/hazmat_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HazmatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/hazmat_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HazmatArmorItem object) {
        return null;
    }
}