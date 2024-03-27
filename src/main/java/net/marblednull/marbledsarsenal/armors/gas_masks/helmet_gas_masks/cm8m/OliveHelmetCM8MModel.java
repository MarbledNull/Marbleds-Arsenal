package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.OliveHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.OliveHelmetCM8MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveHelmetCM8MModel extends AnimatedGeoModel<OliveHelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm8m.animation.json");
    }
}