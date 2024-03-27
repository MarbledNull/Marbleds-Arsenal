package net.marblednull.marbledsarsenal.armors.helmets.combat_helmet;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CombatHelmetModel extends AnimatedGeoModel<CombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelLocation(CombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}