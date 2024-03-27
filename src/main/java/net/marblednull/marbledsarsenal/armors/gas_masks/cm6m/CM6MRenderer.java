package net.marblednull.marbledsarsenal.armors.gas_masks.cm6m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CM6MRenderer extends GeoArmorRenderer<CM6MArmorItem> {
    public CM6MRenderer() {
        super(new CM6MModel());
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
