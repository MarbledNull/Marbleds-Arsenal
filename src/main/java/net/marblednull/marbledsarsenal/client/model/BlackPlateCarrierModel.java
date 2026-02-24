package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.BlackPlateCarrierArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackPlateCarrierModel extends AnimatedGeoModel<BlackPlateCarrierArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BlackPlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/plate_carrier.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BlackPlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_plate_carrier.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BlackPlateCarrierArmorItem object) {
        return null;
    }
}