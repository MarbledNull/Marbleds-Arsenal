package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.MilitaryBeretArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MilitaryBeretModel extends GeoModel<MilitaryBeretArmorItem> {

    @Override
    public ResourceLocation getModelResource(MilitaryBeretArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MilitaryBeretArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/black_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MilitaryBeretArmorItem animatable) {
        return null;
    }
}
