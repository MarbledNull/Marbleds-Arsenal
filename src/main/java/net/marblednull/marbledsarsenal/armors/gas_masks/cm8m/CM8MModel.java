package net.marblednull.marbledsarsenal.armors.gas_masks.cm8m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.CM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CM8MModel extends AnimatedGeoModel<CM8MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(CM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/cm8m.animation.json");
    }
}