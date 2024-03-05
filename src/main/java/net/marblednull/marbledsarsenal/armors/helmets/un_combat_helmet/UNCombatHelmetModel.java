package net.marblednull.marbledsarsenal.armors.helmets.un_combat_helmet;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UNCombatHelmetModel extends AnimatedGeoModel<UNCombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelResource(UNCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/un_combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UNCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(UNCombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/un_combat_helmet.animation.json");
    }
}