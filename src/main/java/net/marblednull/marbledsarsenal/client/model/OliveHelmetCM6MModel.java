package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.OliveHelmetCM6MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveHelmetCM6MModel extends AnimatedGeoModel<OliveHelmetCM6MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OliveHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OliveHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OliveHelmetCM6MArmorItem object) {
        return null;
    }
}