package net.marblednull.marbledsarsenal.armors.body_armors;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackPlateCarrierModel extends AnimatedGeoModel<BlackPlateCarrierArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BlackPlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/black_plate_carrier.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BlackPlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_plate_carrier.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BlackPlateCarrierArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/black_plate_carrier.animation.json");
    }
}