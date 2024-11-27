package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.PlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CombatHelmetModel extends GeoModel<CombatHelmetArmorItem> {

    @Override
    public ResourceLocation getModelResource(CombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CombatHelmetArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}
