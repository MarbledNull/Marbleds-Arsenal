package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.WinterMilitaryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WinterMilitaryArmorModel extends GeoModel<WinterMilitaryArmorItem> {

    @Override
    public ResourceLocation getModelResource(WinterMilitaryArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WinterMilitaryArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/winter_military_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WinterMilitaryArmorItem animatable) {
        return null;
    }
}
