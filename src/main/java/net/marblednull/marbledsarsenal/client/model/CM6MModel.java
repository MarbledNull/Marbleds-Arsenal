package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.CM6MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CM6MModel extends AnimatedGeoModel<CM6MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(CM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CM6MArmorItem object) {
        return null;
    }
}