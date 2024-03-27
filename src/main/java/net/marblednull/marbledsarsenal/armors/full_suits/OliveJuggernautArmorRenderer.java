package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.OliveJuggernautArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OliveJuggernautArmorRenderer extends GeoArmorRenderer<OliveJuggernautArmorItem> {
    public OliveJuggernautArmorRenderer() {
        super(new OliveJuggernautArmorModel());
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
