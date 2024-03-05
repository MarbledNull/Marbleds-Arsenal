package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.HelmetCM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HelmetCM6MRenderer extends GeoArmorRenderer<HelmetCM6MArmorItem> {
    public HelmetCM6MRenderer() {
        super(new HelmetCM6MModel());
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
