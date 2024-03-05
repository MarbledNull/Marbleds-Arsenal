package net.marblednull.marbledsarsenal.armors.helmets.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalOliveCombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MedicalOliveCombatHelmetModel extends AnimatedGeoModel<MedicalOliveCombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelResource(MedicalOliveCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalOliveCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_olive_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalOliveCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}