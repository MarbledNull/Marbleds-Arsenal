package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.OliveHelmetCM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveHelmetCM6MModel extends AnimatedGeoModel<OliveHelmetCM6MArmorItem> {
    @Override
    public ResourceLocation getModelResource(OliveHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OliveHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OliveHelmetCM6MArmorItem object) {
        return null;
    }
}