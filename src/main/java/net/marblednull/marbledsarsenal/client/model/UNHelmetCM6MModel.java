package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.UNHelmetCM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UNHelmetCM6MModel extends AnimatedGeoModel<UNHelmetCM6MArmorItem> {
    @Override
    public ResourceLocation getModelResource(UNHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UNHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(UNHelmetCM6MArmorItem object) {
        return null;
    }
}