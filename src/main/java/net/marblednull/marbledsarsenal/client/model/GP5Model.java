package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.WhiteGP5ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GP5Model extends GeoModel<WhiteGP5ArmorItem> {

    @Override
    public ResourceLocation getModelResource(WhiteGP5ArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/gp5.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WhiteGP5ArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/gp5.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WhiteGP5ArmorItem animatable) {
        return null;
    }
}
