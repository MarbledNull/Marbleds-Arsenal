package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.PoliceArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.CM7MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PoliceArmorModel extends GeoModel<PoliceArmorItem> {

    @Override
    public ResourceLocation getModelResource(PoliceArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/police_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PoliceArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/police_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PoliceArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/police_armor.animation.json");
    }
}
