package net.marblednull.marbledsarsenal.armors.gas_masks.gp5;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackGP5Model extends AnimatedGeoModel<BlackGP5ArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BlackGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/gp5.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BlackGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_gp5.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BlackGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/gp5.animation.json");
    }
}