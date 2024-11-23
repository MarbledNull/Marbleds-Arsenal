package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.UNHelmetCM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class UNHelmetCM7MModel extends GeoModel<UNHelmetCM7MArmorItem> {

    @Override
    public ResourceLocation getModelResource(UNHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UNHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(UNHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm7m.animation.json");
    }
}
