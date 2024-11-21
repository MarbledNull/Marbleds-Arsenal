package net.marblednull.marbledsarsenal.client.model;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
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

    public static class BlackPlateCarrierModel extends GeoModel<BlackPlateCarrierArmorItem> {

        @Override
        public ResourceLocation getModelResource(BlackPlateCarrierArmorItem animatable) {
            return new ResourceLocation(MarbledsArsenal.MODID, "geo/plate_carrier.geo.json");
        }

        @Override
        public ResourceLocation getTextureResource(BlackPlateCarrierArmorItem animatable) {
            return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_plate_carrier.png");
        }

        @Override
        public ResourceLocation getAnimationResource(BlackPlateCarrierArmorItem animatable) {
            return new ResourceLocation(MarbledsArsenal.MODID, "animations/plate_carrier.animation.json");
        }
    }

    public static class OlivePlateCarrierModel extends GeoModel<OlivePlateCarrierArmorItem> {

        @Override
        public ResourceLocation getModelResource(OlivePlateCarrierArmorItem animatable) {
            return new ResourceLocation(MarbledsArsenal.MODID, "geo/plate_carrier.geo.json");
        }

        @Override
        public ResourceLocation getTextureResource(OlivePlateCarrierArmorItem animatable) {
            return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_plate_carrier.png");
        }

        @Override
        public ResourceLocation getAnimationResource(OlivePlateCarrierArmorItem animatable) {
            return new ResourceLocation(MarbledsArsenal.MODID, "animations/plate_carrier.animation.json");
        }
    }
}
