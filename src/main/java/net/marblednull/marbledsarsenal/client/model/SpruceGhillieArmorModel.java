package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.SpruceGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SpruceGhillieArmorModel extends AnimatedGeoModel<SpruceGhillieArmorItem> {
    @Override
    public ResourceLocation getModelResource(SpruceGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpruceGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/spruce_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SpruceGhillieArmorItem object) {
        return null;
    }
}