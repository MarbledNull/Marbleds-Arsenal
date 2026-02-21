package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.JungleGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JungleGhillieArmorModel extends GeoModel<JungleGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(JungleGhillieArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JungleGhillieArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/jungle_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JungleGhillieArmorItem animatable) {
        return null;
    }
}
