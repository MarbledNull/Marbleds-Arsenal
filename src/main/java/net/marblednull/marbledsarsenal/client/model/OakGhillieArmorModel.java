package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.OakGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OakGhillieArmorModel extends AnimatedGeoModel<OakGhillieArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OakGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OakGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/oak_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OakGhillieArmorItem object) {
        return null;
    }
}