package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.MilitaryBeretArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MilitaryBeretModel extends GeoModel<MilitaryBeretArmorItem> {

    @Override
    public ResourceLocation getModelResource(MilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/military_beret.animation.json");
    }
}
