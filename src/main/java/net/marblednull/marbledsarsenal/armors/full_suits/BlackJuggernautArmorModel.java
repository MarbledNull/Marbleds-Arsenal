package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.BlackJuggernautArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.OliveJuggernautArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackJuggernautArmorModel extends AnimatedGeoModel<BlackJuggernautArmorItem> {
    @Override
    public ResourceLocation getModelResource(BlackJuggernautArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/juggernaut_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlackJuggernautArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_juggernaut_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlackJuggernautArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/juggernaut_armor.json");
    }
}