package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.BlackJuggernautArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.OliveJuggernautArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackJuggernautArmorRenderer extends GeoArmorRenderer<BlackJuggernautArmorItem> {
    public BlackJuggernautArmorRenderer() {
        super(new BlackJuggernautArmorModel());
        this.headBone ="armorHead";
        this.bodyBone ="armorBody";
        this.rightArmBone ="armorRightArm";
        this.leftArmBone ="armorLeftArm";
        this.rightLegBone ="armorRightLeg";
        this.leftLegBone ="armorLeftLeg";
        this.leftBootBone ="armorLeftBoot";
        this.rightBootBone ="armorRightBoot";
    }
}
