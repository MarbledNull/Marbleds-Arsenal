package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.UNHelmetCM7MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UNHelmetCM7MModel extends AnimatedGeoModel<UNHelmetCM7MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(UNHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(UNHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(UNHelmetCM7MArmorItem object) {
        return null;
    }
}