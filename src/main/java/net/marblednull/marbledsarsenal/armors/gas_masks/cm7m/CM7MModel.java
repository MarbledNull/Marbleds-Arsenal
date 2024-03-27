package net.marblednull.marbledsarsenal.armors.gas_masks.cm7m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.CM7MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CM7MModel extends AnimatedGeoModel<CM7MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(CM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/cm7m.animation.json");
    }
}