package net.marblednull.marbledsarsenal.client.gas_masks.cm7m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.CM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CM7MModel extends GeoModel<CM7MArmorItem> {

    @Override
    public ResourceLocation getModelResource(CM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/cm7m.animation.json");
    }
}
