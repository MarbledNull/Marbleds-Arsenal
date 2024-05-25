package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.BirchGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.JungleGhillieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JungleGhillieArmorModel extends GeoModel<JungleGhillieArmorItem> {

    @Override
    public ResourceLocation getModelResource(JungleGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JungleGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/jungle_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JungleGhillieArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/ghillie_armor.animation.json");
    }
}
