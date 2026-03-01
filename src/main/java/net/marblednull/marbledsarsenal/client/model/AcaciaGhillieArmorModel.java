package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.AcaciaGhillieArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AcaciaGhillieArmorModel extends AnimatedGeoModel<AcaciaGhillieArmorItem> {
    @Override
    public ResourceLocation getModelLocation(AcaciaGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AcaciaGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/acacia_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AcaciaGhillieArmorItem object) {
        return null;
    }
}