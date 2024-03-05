package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.medical.MedicalOliveHelmetCM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class MedicalOliveHelmetCM7MModel extends AnimatedGeoModel<MedicalOliveHelmetCM7MArmorItem> {
    @Override
    public ResourceLocation getModelResource(MedicalOliveHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalOliveHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_olive_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalOliveHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm7m.animation.json");
    }
}