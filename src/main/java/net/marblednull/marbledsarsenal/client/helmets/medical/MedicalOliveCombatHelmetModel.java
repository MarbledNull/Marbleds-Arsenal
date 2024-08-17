package net.marblednull.marbledsarsenal.client.helmets.medical;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalOliveCombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MedicalOliveCombatHelmetModel extends GeoModel<MedicalOliveCombatHelmetArmorItem> {

    @Override
    public ResourceLocation getModelResource(MedicalOliveCombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MedicalOliveCombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/medical_olive_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MedicalOliveCombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}
