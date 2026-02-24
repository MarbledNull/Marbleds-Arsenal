package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.BalaclavaArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BalaclavaModel extends GeoModel<BalaclavaArmorItem> {

    @Override
    public ResourceLocation getModelResource(BalaclavaArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/balaclava.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BalaclavaArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/balaclava.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BalaclavaArmorItem animatable) {
        return null;
    }
}
