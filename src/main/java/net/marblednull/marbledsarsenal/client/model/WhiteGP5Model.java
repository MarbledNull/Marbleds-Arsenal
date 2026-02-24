package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.WhiteGP5ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WhiteGP5Model extends AnimatedGeoModel<WhiteGP5ArmorItem> {
    @Override
    public ResourceLocation getModelResource(WhiteGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/gp5.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WhiteGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/white_gp5.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WhiteGP5ArmorItem object) {
        return null;
    }
}