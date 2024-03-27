package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.OliveHelmetCM8MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OliveHelmetCM8MRenderer extends GeoArmorRenderer<OliveHelmetCM8MArmorItem> {
    public OliveHelmetCM8MRenderer() {
        super(new OliveHelmetCM8MModel());
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
