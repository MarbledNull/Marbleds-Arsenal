package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.RiotArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RiotArmorModel extends AnimatedGeoModel<RiotArmorItem> {
    @Override
    public ResourceLocation getModelLocation(RiotArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/riot_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RiotArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/riot_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RiotArmorItem object) {
        return null;
    }
}