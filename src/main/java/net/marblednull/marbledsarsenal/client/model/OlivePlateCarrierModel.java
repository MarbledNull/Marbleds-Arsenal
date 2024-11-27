package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.PlateCarrierArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OlivePlateCarrierModel extends GeoModel<OlivePlateCarrierArmorItem> {

    @Override
    public ResourceLocation getModelResource(OlivePlateCarrierArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/light_plate_carrier.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OlivePlateCarrierArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_plate_carrier.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OlivePlateCarrierArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/plate_carrier.animation.json");
    }
}
