package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.JungleGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JungleGhillieArmorModel extends AnimatedGeoModel<JungleGhillieArmorItem> {
    @Override
    public ResourceLocation getModelLocation(JungleGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(JungleGhillieArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/jungle_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(JungleGhillieArmorItem object) {
        return null;
    }
}