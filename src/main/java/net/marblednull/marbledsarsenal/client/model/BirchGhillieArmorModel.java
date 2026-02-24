package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.BirchGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BirchGhillieArmorModel extends AnimatedGeoModel<BirchGhillieArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BirchGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BirchGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/birch_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BirchGhillieArmorItem object) {
        return null;
    }
}