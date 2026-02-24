package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.WinterMilitaryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WinterMilitaryArmorModel extends AnimatedGeoModel<WinterMilitaryArmorItem> {
    @Override
    public ResourceLocation getModelLocation(WinterMilitaryArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WinterMilitaryArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/winter_military_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WinterMilitaryArmorItem object) {
        return null;
    }
}