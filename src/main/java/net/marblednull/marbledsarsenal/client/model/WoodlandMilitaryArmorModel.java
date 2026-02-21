package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.WoodlandMilitaryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WoodlandMilitaryArmorModel extends GeoModel<WoodlandMilitaryArmorItem> {

    @Override
    public ResourceLocation getModelResource(WoodlandMilitaryArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/military_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WoodlandMilitaryArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/woodland_military_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WoodlandMilitaryArmorItem animatable) {
        return null;
    }
}
