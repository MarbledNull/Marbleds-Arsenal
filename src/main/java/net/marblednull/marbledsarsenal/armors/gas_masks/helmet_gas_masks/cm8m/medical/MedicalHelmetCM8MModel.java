package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.medical.MedicalHelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class MedicalHelmetCM8MModel extends AnimatedGeoModel<MedicalHelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelResource(MedicalHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm8m.animation.json");
    }
}