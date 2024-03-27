package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.OliveHelmetCM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OliveHelmetCM6MRenderer extends GeoArmorRenderer<OliveHelmetCM6MArmorItem> {
    public OliveHelmetCM6MRenderer() {
        super(new OliveHelmetCM6MModel());
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
