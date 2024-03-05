package net.marblednull.marbledsarsenal.armors.gas_masks.cm6m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.HelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalHelmetCM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MedicalHelmetCM6MModel extends GeoModel<MedicalHelmetCM6MArmorItem> {

    @Override
    public ResourceLocation getModelResource(MedicalHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm6m.animation.json");
    }
}
