package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.HelmetCM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HelmetCM7MModel extends GeoModel<HelmetCM7MArmorItem> {

    @Override
    public ResourceLocation getModelResource(HelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HelmetCM7MArmorItem animatable) {
        return null;
    }
}
