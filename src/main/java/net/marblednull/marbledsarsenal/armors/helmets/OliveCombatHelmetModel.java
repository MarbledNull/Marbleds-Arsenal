package net.marblednull.marbledsarsenal.armors.helmets;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.OliveCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OliveCombatHelmetModel extends GeoModel<OliveCombatHelmetArmorItem> {

    @Override
    public ResourceLocation getModelResource(OliveCombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OliveCombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OliveCombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}
