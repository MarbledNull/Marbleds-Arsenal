package net.marblednull.marbledsarsenal.client.helmets.beret;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.RedMilitaryBeretArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RedMilitaryBeretModel extends GeoModel<RedMilitaryBeretArmorItem> {

    @Override
    public ResourceLocation getModelResource(RedMilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RedMilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/red_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RedMilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/military_beret.animation.json");
    }
}
