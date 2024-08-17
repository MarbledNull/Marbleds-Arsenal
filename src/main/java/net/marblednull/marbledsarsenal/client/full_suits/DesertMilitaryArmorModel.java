package net.marblednull.marbledsarsenal.client.full_suits;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.DesertMilitaryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DesertMilitaryArmorModel extends GeoModel<DesertMilitaryArmorItem> {

    @Override
    public ResourceLocation getModelResource(DesertMilitaryArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DesertMilitaryArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/desert_military_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DesertMilitaryArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/military_armor.animation.json");
    }
}
