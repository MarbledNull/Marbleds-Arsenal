package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.OliveHelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveHelmetCM8MModel extends AnimatedGeoModel<OliveHelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelResource(OliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OliveHelmetCM8MArmorItem object) {
        return null;
    }
}