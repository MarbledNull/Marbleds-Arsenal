package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.OliveCombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveCombatHelmetModel extends AnimatedGeoModel<OliveCombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OliveCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OliveCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OliveCombatHelmetArmorItem object) {
        return null;
    }
}