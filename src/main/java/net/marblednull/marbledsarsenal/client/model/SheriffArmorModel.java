package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.PoliceArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.SheriffArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SheriffArmorModel extends GeoModel<SheriffArmorItem> {

    @Override
    public ResourceLocation getModelResource(SheriffArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/sheriff_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SheriffArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/sheriff_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SheriffArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/sheriff_armor.animation.json");
    }
}
