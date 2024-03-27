package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.HelmetCM6MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HelmetCM6MModel extends AnimatedGeoModel<HelmetCM6MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(HelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm6m.animation.json");
    }
}