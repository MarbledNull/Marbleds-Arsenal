package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.UNCombatHelmetArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UNCombatHelmetModel extends AnimatedGeoModel<UNCombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelLocation(UNCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(UNCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(UNCombatHelmetArmorItem object) {
        return null;
    }
}