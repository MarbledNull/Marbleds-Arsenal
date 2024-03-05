package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.HelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HelmetCM8MModel extends AnimatedGeoModel<HelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelResource(HelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm8m.animation.json");
    }
}