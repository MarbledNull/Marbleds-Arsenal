package net.marblednull.marbledsarsenal.armors.body_armors;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlackPlateCarrierModel extends GeoModel<BlackPlateCarrierArmorItem> {

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
