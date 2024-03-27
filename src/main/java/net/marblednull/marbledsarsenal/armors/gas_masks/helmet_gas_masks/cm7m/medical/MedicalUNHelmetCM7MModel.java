package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalUNHelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.MedicalUNHelmetCM8MArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MedicalUNHelmetCM7MModel extends AnimatedGeoModel<MedicalUNHelmetCM7MArmorItem> {
    @Override
    public ResourceLocation getModelLocation(MedicalUNHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MedicalUNHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_un_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MedicalUNHelmetCM7MArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm7m.animation.json");
    }
}