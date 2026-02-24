package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.SwatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SwatArmorModel extends AnimatedGeoModel<SwatArmorItem> {
    @Override
    public ResourceLocation getModelResource(SwatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/swat_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SwatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/swat_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SwatArmorItem object) {
        return null;
    }
}