package net.marblednull.marbledsarsenal.armors.gas_masks.cm6m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.HelmetCM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HelmetCM6MModel extends GeoModel<HelmetCM6MArmorItem> {

    @Override
    public ResourceLocation getModelResource(HelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm6m.animation.json");
    }
}
