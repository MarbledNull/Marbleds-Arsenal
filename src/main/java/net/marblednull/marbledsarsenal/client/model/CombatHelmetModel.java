package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.CombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CombatHelmetModel extends AnimatedGeoModel<CombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelLocation(CombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CombatHelmetArmorItem object) {
        return null;
    }
}