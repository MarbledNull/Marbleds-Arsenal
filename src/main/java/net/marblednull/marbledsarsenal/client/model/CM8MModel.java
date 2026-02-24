package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.CM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CM8MModel extends AnimatedGeoModel<CM8MArmorItem> {
    @Override
    public ResourceLocation getModelResource(CM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CM8MArmorItem object) {
        return null;
    }
}