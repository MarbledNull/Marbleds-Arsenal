package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.BlackJuggernautArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackJuggernautArmorModel extends AnimatedGeoModel<BlackJuggernautArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BlackJuggernautArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/juggernaut_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BlackJuggernautArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_juggernaut_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BlackJuggernautArmorItem object) {
        return null;
    }
}