package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.CM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
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
        return null;
    }
}