package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.WinterMilitaryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WinterMilitaryArmorModel extends AnimatedGeoModel<WinterMilitaryArmorItem> {
    @Override
    public ResourceLocation getModelResource(WinterMilitaryArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WinterMilitaryArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/winter_military_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WinterMilitaryArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/riot_armor.military_armor.json");
    }
}