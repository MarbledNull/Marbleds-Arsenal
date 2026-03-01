package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.OliveHelmetCM7MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveHelmetCM7MModel extends AnimatedGeoModel<OliveHelmetCM7MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OliveHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OliveHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OliveHelmetCM7MArmorItem object) {
        return null;
    }
}