package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.WhiteGP5ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WhiteGP5Model extends GeoModel<WhiteGP5ArmorItem> {

    @Override
    public ResourceLocation getModelResource(WhiteGP5ArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/gp5.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WhiteGP5ArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/white_gp5.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WhiteGP5ArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/gp5.animation.json");
    }
}
