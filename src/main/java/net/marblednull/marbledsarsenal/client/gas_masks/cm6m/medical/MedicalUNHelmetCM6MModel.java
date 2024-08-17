package net.marblednull.marbledsarsenal.client.gas_masks.cm6m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalUNHelmetCM6MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MedicalUNHelmetCM6MModel extends GeoModel<MedicalUNHelmetCM6MArmorItem> {

    @Override
    public ResourceLocation getModelResource(MedicalUNHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm6m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalUNHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_un_helmet_cm6m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalUNHelmetCM6MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm6m.animation.json");
    }
}
