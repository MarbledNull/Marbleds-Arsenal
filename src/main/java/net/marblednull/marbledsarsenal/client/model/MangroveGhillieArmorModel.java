package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.MangroveGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MangroveGhillieArmorModel extends AnimatedGeoModel<MangroveGhillieArmorItem> {
    @Override
    public ResourceLocation getModelResource(MangroveGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MangroveGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/mangrove_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MangroveGhillieArmorItem object) {
        return null;
    }
}