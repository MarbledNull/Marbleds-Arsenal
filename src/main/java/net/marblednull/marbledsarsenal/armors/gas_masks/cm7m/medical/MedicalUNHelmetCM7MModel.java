package net.marblednull.marbledsarsenal.armors.gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalUNHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalUNHelmetCM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MedicalUNHelmetCM7MModel extends GeoModel<MedicalUNHelmetCM7MArmorItem> {

    @Override
    public ResourceLocation getModelResource(MedicalUNHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalUNHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_un_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalUNHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm7m.animation.json");
    }
}
