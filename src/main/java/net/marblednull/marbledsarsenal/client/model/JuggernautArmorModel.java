package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.JuggernautArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JuggernautArmorModel extends GeoModel<JuggernautArmorItem> {

    @Override
    public ResourceLocation getModelResource(JuggernautArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "geo/juggernaut_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JuggernautArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, "textures/armor/olive_juggernaut_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JuggernautArmorItem animatable) {
        return null;
    }
}
