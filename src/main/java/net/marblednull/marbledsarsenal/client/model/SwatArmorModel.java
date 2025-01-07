package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.SwatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SwatArmorModel extends GeoModel<SwatArmorItem> {

    @Override
    public ResourceLocation getModelResource(SwatArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/swat_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SwatArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/swat_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SwatArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/swat_armor.animation.json");
    }
}
