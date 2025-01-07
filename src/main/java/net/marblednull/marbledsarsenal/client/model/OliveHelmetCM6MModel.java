package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.OliveHelmetCM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OliveHelmetCM6MModel extends GeoModel<OliveHelmetCM6MArmorItem> {

    @Override
    public ResourceLocation getModelResource(OliveHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OliveHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OliveHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm6m.animation.json");
    }
}
