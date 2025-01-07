package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.OliveHelmetCM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OliveHelmetCM7MModel extends GeoModel<OliveHelmetCM7MArmorItem> {

    @Override
    public ResourceLocation getModelResource(OliveHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OliveHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OliveHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm7m.animation.json");
    }
}
