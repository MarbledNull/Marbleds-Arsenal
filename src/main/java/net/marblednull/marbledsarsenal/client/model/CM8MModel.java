package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.CM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CM8MModel extends GeoModel<CM8MArmorItem> {

    @Override
    public ResourceLocation getModelResource(CM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/cm8m.animation.json");
    }
}
