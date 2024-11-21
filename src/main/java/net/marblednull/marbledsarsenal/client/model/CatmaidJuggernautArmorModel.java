package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.CatmaidJuggernautArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CatmaidJuggernautArmorModel extends GeoModel<CatmaidJuggernautArmorItem> {

    @Override
    public ResourceLocation getModelResource(CatmaidJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/juggernaut_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CatmaidJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/catmaid_juggernaut_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CatmaidJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/juggernaut_armor.animation.json");
    }
}
