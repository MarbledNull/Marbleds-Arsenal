package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.OlivePlateCarrierArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OlivePlateCarrierModel extends GeoModel<OlivePlateCarrierArmorItem> {

    @Override
    public ResourceLocation getModelResource(OlivePlateCarrierArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/olive_plate_carrier.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OlivePlateCarrierArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/olive_plate_carrier.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OlivePlateCarrierArmorItem animatable) {
        return null;
    }
}
