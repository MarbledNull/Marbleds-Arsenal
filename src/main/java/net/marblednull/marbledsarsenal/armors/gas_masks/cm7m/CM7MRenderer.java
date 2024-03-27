package net.marblednull.marbledsarsenal.armors.gas_masks.cm7m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.CM7MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CM7MRenderer extends GeoArmorRenderer<CM7MArmorItem> {
    public CM7MRenderer() {
        super(new CM7MModel());
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
