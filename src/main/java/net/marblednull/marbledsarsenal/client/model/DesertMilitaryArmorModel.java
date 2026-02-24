package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.DesertMilitaryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DesertMilitaryArmorModel extends AnimatedGeoModel<DesertMilitaryArmorItem> {
    @Override
    public ResourceLocation getModelLocation(DesertMilitaryArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DesertMilitaryArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/desert_military_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DesertMilitaryArmorItem object) {
        return null;
    }
}