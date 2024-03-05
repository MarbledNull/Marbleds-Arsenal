package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.medical.MedicalUNHelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class MedicalUNHelmetCM8MModel extends AnimatedGeoModel<MedicalUNHelmetCM8MArmorItem> {
    @Override
    public ResourceLocation getModelResource(MedicalUNHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalUNHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_un_helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalUNHelmetCM8MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm8m.animation.json");
    }
}