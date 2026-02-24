package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.RiotArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RiotArmorModel extends AnimatedGeoModel<RiotArmorItem> {
    @Override
    public ResourceLocation getModelResource(RiotArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/riot_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RiotArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/riot_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RiotArmorItem object) {
        return null;
    }
}