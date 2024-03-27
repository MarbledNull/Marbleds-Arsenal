package net.marblednull.marbledsarsenal.armors.body_armors;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OlivePlateCarrierModel extends AnimatedGeoModel<OlivePlateCarrierArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OlivePlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/plate_carrier.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OlivePlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_plate_carrier.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OlivePlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/plate_carrier.animation.json");
    }
}