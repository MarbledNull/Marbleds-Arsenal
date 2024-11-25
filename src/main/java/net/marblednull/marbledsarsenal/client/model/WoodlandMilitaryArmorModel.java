package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.DesertMilitaryArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.WoodlandMilitaryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WoodlandMilitaryArmorModel extends GeoModel<WoodlandMilitaryArmorItem> {

    @Override
    public ResourceLocation getModelResource(WoodlandMilitaryArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WoodlandMilitaryArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/woodland_military_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WoodlandMilitaryArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/military_armor.animation.json");
    }
}
