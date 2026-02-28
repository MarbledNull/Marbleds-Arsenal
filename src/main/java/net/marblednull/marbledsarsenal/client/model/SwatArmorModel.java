package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.SwatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SwatArmorModel extends AnimatedGeoModel<SwatArmorItem> {
    @Override
    public ResourceLocation getModelLocation(SwatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/swat_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SwatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/swat_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SwatArmorItem object) {
        return null;
    }
}