package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.AzaleaGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AzaleaGhillieArmorModel extends GeoModel<AzaleaGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(AzaleaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AzaleaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/azalea_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AzaleaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/ghillie_armor.animation.json");
    }
}
