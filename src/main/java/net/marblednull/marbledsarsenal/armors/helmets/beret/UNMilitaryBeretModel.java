package net.marblednull.marbledsarsenal.armors.helmets.beret;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.RedMilitaryBeretArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNMilitaryBeretArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UNMilitaryBeretModel extends AnimatedGeoModel<UNMilitaryBeretArmorItem> {
    @Override
    public ResourceLocation getModelResource(UNMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UNMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/un_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationResource(UNMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/military_beret.animation.json");
    }
}