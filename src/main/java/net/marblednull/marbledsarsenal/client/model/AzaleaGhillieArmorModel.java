package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.AzaleaGhillieArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AzaleaGhillieArmorModel extends AnimatedGeoModel<AzaleaGhillieArmorItem> {
    @Override
    public ResourceLocation getModelLocation(AzaleaGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AzaleaGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/azalea_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AzaleaGhillieArmorItem object) {
        return null;
    }
}