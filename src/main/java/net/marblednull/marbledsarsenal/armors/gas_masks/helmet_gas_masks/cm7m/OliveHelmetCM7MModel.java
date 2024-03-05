package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.OliveHelmetCM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveHelmetCM7MModel extends AnimatedGeoModel<OliveHelmetCM7MArmorItem> {
    @Override
    public ResourceLocation getModelResource(OliveHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OliveHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OliveHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm7m.animation.json");
    }
}