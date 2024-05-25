package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AzaleaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.FloweringAzeleaGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FloweringAzaleaGhillieArmorModel extends GeoModel<FloweringAzeleaGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(FloweringAzeleaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FloweringAzeleaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/flowering_azalea_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FloweringAzeleaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/ghillie_armor.animation.json");
    }
}
