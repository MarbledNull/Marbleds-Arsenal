package net.marblednull.marbledsarsenal.client.full_suits;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.BlackJuggernautArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlackJuggernautArmorModel extends GeoModel<BlackJuggernautArmorItem> {

    @Override
    public ResourceLocation getModelResource(BlackJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/juggernaut_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlackJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_juggernaut_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlackJuggernautArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/juggernaut_armor.animation.json");
    }
}
