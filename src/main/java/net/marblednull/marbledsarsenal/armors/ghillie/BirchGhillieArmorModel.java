package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.BirchGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.OakGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BirchGhillieArmorModel extends GeoModel<BirchGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(BirchGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BirchGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/birch_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BirchGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/ghillie_armor.animation.json");
    }
}
