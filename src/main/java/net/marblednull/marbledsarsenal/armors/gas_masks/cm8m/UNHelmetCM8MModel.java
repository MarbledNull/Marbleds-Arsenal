package net.marblednull.marbledsarsenal.armors.gas_masks.cm8m;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.UNHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.UNHelmetCM8MArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class UNHelmetCM8MModel extends GeoModel<UNHelmetCM8MArmorItem> {

    @Override
    public ResourceLocation getModelResource(UNHelmetCM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/helmet_cm8m.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UNHelmetCM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_helmet_cm8m.png");
    }

    @Override
    public ResourceLocation getAnimationResource(UNHelmetCM8MArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/helmet_cm8m.animation.json");
    }
}
