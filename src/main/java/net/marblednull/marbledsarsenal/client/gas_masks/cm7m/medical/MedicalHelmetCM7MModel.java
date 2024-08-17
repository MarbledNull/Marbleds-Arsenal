package net.marblednull.marbledsarsenal.client.gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalHelmetCM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MedicalHelmetCM7MModel extends GeoModel<MedicalHelmetCM7MArmorItem> {

    @Override
    public ResourceLocation getModelResource(MedicalHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm7m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_helmet_cm7m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalHelmetCM7MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm7m.animation.json");
    }
}
