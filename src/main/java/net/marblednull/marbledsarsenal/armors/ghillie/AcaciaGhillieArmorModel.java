package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.BirchGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AcaciaGhillieArmorModel extends GeoModel<AcaciaGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(AcaciaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AcaciaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/acacia_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AcaciaGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/ghillie_armor.animation.json");
    }
}
