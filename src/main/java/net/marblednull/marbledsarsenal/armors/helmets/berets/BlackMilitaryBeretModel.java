package net.marblednull.marbledsarsenal.armors.helmets.berets;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.BlackMilitaryBeretArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackMilitaryBeretModel extends AnimatedGeoModel<BlackMilitaryBeretArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BlackMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/military_beret.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BlackMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/black_military_beret.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BlackMilitaryBeretArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/military_beret.animation.json");
    }
}