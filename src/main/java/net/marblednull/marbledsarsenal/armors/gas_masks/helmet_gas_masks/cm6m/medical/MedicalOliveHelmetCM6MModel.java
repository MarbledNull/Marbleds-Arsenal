package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.medical.MedicalOliveHelmetCM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class MedicalOliveHelmetCM6MModel extends AnimatedGeoModel<MedicalOliveHelmetCM6MArmorItem> {
    @Override
    public ResourceLocation getModelResource(MedicalOliveHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalOliveHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_olive_helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalOliveHelmetCM6MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm6m.animation.json");
    }
}