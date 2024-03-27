package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import net.minecraft.util.ResourceLocation;
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
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/riot_armor.animation.json");
    }
}