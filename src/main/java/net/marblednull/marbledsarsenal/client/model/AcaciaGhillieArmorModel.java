package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.BlackGP5ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AcaciaGhillieArmorModel extends AnimatedGeoModel<AcaciaGhillieArmorItem> {
    @Override
    public ResourceLocation getModelResource(AcaciaGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AcaciaGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/acacia_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AcaciaGhillieArmorItem object) {
        return null;
    }
}