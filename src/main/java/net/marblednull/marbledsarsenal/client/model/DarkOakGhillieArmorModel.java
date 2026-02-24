package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.DarkOakGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DarkOakGhillieArmorModel extends AnimatedGeoModel<DarkOakGhillieArmorItem> {
    @Override
    public ResourceLocation getModelResource(DarkOakGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DarkOakGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/dark_oak_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DarkOakGhillieArmorItem object) {
        return null;
    }
}