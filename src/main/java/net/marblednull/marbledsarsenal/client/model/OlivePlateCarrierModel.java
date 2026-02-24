package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.OlivePlateCarrierArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OlivePlateCarrierModel extends AnimatedGeoModel<OlivePlateCarrierArmorItem> {
    @Override
    public ResourceLocation getModelResource(OlivePlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/plate_carrier.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OlivePlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_plate_carrier.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OlivePlateCarrierArmorItem object) {
        return null;
    }
}