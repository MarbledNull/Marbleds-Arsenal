package net.marblednull.marbledsarsenal.armors.helmets.olive;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.OliveCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OliveCombatHelmetModel extends AnimatedGeoModel<OliveCombatHelmetArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OliveCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/combat_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OliveCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/olive_combat_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OliveCombatHelmetArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/combat_helmet.animation.json");
    }
}