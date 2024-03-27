package net.marblednull.marbledsarsenal.armors.helmets.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.MedicalUNCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MedicalUNCombatHelmetModel extends AnimatedGeoModel<MedicalUNCombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelLocation(MedicalUNCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MedicalUNCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_un_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MedicalUNCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}