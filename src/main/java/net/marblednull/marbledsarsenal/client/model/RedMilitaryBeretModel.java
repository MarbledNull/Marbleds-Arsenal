package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.RedMilitaryBeretArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RedMilitaryBeretModel extends AnimatedGeoModel<RedMilitaryBeretArmorItem> {
    @Override
    public ResourceLocation getModelLocation(RedMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RedMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/red_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RedMilitaryBeretArmorItem object) {
        return null;
    }
}