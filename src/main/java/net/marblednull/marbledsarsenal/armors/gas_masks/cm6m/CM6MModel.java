package net.marblednull.marbledsarsenal.armors.gas_masks.cm6m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CM6MModel extends AnimatedGeoModel<CM6MArmorItem> {
    @Override
    public ResourceLocation getModelResource(CM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/cm6m.animation.json");
    }
}