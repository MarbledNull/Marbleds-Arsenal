package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.BlackGP5ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlackGP5Model extends GeoModel<BlackGP5ArmorItem> {

    @Override
    public ResourceLocation getModelResource(BlackGP5ArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/gp5.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlackGP5ArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/black_gp5.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlackGP5ArmorItem animatable) {
        return null;
    }
}
