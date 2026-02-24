package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.BlackMilitaryBeretArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackMilitaryBeretModel extends AnimatedGeoModel<BlackMilitaryBeretArmorItem> {
    @Override
    public ResourceLocation getModelResource(BlackMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlackMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlackMilitaryBeretArmorItem object) {
        return null;
    }
}