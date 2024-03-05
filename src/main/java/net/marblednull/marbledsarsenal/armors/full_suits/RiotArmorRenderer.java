package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RiotArmorRenderer extends GeoArmorRenderer<RiotArmorItem> {
    public RiotArmorRenderer() {
        super(new RiotArmorModel());
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
