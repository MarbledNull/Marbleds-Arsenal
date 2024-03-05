package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.OliveJuggernautArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveJuggernautArmorModel extends AnimatedGeoModel<OliveJuggernautArmorItem> {
    @Override
    public ResourceLocation getModelResource(OliveJuggernautArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/juggernaut_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OliveJuggernautArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_juggernaut_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OliveJuggernautArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/juggernaut_armor.json");
    }
}