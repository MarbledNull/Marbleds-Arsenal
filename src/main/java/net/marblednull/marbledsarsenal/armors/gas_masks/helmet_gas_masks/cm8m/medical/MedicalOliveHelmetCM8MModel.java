package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.medical.MedicalOliveHelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class MedicalOliveHelmetCM8MModel extends AnimatedGeoModel<MedicalOliveHelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelResource(MedicalOliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalOliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_olive_helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalOliveHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm8m.animation.json");
    }
}