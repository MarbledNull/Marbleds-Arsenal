package net.marblednull.marbledsarsenal.armors.gas_masks.gp5;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackGP5Model extends AnimatedGeoModel<BlackGP5ArmorItem> {
    @Override
    public ResourceLocation getModelResource(BlackGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/gp5.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlackGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_gp5.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlackGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/gp5.animation.json");
    }
}