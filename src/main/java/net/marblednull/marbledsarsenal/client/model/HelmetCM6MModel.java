package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.HelmetCM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HelmetCM6MModel extends AnimatedGeoModel<HelmetCM6MArmorItem> {
    @Override
    public ResourceLocation getModelResource(HelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HelmetCM6MArmorItem object) {
        return null;
    }
}