package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.BirchGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BirchGhillieArmorModel extends GeoModel<BirchGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(BirchGhillieArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BirchGhillieArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/birch_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BirchGhillieArmorItem animatable) {
        return null;
    }
}
