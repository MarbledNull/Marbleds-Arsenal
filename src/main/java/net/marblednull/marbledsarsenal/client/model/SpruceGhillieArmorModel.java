package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.SpruceGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SpruceGhillieArmorModel extends GeoModel<SpruceGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(SpruceGhillieArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpruceGhillieArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/spruce_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SpruceGhillieArmorItem animatable) {
        return null;
    }
}
