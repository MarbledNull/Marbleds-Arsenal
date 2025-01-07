package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.HelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HelmetCM8MModel extends GeoModel<HelmetCM8MArmorItem> {

    @Override
    public ResourceLocation getModelResource(HelmetCM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HelmetCM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HelmetCM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm8m.animation.json");
    }
}
