package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.PlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PlateCarrierModel extends GeoModel<PlateCarrierArmorItem> {

    @Override
    public ResourceLocation getModelResource(PlateCarrierArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/light_plate_carrier.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PlateCarrierArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/plate_carrier.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PlateCarrierArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/plate_carrier.animation.json");
    }
}
