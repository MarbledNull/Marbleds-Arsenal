package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.UNMilitaryBeretArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UNMilitaryBeretModel extends AnimatedGeoModel<UNMilitaryBeretArmorItem> {
    @Override
    public ResourceLocation getModelLocation(UNMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(UNMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(UNMilitaryBeretArmorItem object) {
        return null;
    }
}