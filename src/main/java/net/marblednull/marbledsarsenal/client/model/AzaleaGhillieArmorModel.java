package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.AzaleaGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AzaleaGhillieArmorModel extends AnimatedGeoModel<AzaleaGhillieArmorItem> {
    @Override
    public ResourceLocation getModelResource(AzaleaGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AzaleaGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/azalea_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AzaleaGhillieArmorItem object) {
        return null;
    }
}