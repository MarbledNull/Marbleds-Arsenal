package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.SwatArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SwatArmorModel extends AnimatedGeoModel<SwatArmorItem> {
    @Override
    public ResourceLocation getModelLocation(SwatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/swat_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SwatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/swat_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SwatArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/swat_armor.animation.json");
    }
}