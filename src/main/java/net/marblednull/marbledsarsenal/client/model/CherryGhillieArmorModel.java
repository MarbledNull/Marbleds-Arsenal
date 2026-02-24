package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.CherryGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CherryGhillieArmorModel extends GeoModel<CherryGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(CherryGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CherryGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/cherry_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CherryGhillieArmorItem animatable) {
        return null;
    }
}
