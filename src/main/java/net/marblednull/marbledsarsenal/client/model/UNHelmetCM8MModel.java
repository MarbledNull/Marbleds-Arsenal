package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.UNHelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UNHelmetCM8MModel extends AnimatedGeoModel<UNHelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelResource(UNHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UNHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(UNHelmetCM8MArmorItem object) {
        return null;
    }
}