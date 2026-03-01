package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.OliveHelmetCM8MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveHelmetCM8MModel extends AnimatedGeoModel<OliveHelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OliveHelmetCM8MArmorItem object) {
        return null;
    }
}