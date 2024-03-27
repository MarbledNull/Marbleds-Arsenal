package net.marblednull.marbledsarsenal.armors.body_armors;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.minecraft.util.ResourceLocation;
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
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/plate_carrier.animation.json");
    }
}