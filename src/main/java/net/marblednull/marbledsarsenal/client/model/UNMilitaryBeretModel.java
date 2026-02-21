package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.UNMilitaryBeretArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class UNMilitaryBeretModel extends GeoModel<UNMilitaryBeretArmorItem> {

    @Override
    public ResourceLocation getModelResource(UNMilitaryBeretArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UNMilitaryBeretArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/un_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationResource(UNMilitaryBeretArmorItem animatable) {
        return null;
    }
}
