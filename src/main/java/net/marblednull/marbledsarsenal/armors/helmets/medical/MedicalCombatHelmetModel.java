package net.marblednull.marbledsarsenal.armors.helmets.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalCombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MedicalCombatHelmetModel extends AnimatedGeoModel<MedicalCombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelResource(MedicalCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}