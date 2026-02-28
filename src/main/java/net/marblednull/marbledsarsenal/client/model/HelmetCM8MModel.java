package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.HelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HelmetCM8MModel extends AnimatedGeoModel<HelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(HelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HelmetCM8MArmorItem object) {
        return null;
    }
}