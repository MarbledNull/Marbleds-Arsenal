package net.marblednull.marbledsarsenal.armors.helmets.beret;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.BlackMilitaryBeretArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlackMilitaryBeretModel extends GeoModel<BlackMilitaryBeretArmorItem> {

    @Override
    public ResourceLocation getModelResource(BlackMilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlackMilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlackMilitaryBeretArmorItem animatable) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/military_beret.animation.json");
    }
}
