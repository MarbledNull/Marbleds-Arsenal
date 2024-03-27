package net.marblednull.marbledsarsenal.armors.body_armors;

import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackPlateCarrierRenderer extends GeoArmorRenderer<BlackPlateCarrierArmorItem> {
    public BlackPlateCarrierRenderer() {
        super(new BlackPlateCarrierModel());
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
