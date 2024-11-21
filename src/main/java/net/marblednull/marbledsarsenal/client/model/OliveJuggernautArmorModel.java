package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.OliveJuggernautArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OliveJuggernautArmorModel extends GeoModel<OliveJuggernautArmorItem> {

    @Override
    public ResourceLocation getModelResource(OliveJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/juggernaut_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OliveJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_juggernaut_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OliveJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/juggernaut_armor.animation.json");
    }
}
