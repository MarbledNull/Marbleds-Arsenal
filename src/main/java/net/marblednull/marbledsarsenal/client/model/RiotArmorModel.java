package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.RiotArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RiotArmorModel extends GeoModel<RiotArmorItem> {

    @Override
    public ResourceLocation getModelResource(RiotArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/riot_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RiotArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/riot_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RiotArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/riot_armor.animation.json");
    }
}
