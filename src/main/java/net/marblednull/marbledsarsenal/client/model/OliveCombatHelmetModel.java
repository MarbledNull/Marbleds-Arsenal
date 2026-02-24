package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.OliveCombatHelmetArmorItem;
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
        return null;
    }
}
