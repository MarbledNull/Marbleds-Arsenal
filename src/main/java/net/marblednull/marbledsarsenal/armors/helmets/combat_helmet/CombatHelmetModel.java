package net.marblednull.marbledsarsenal.armors.helmets.combat_helmet;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CombatHelmetModel extends AnimatedGeoModel<CombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelResource(CombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}