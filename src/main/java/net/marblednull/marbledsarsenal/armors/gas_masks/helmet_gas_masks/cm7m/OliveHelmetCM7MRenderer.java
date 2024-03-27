package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.OliveHelmetCM7MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OliveHelmetCM7MRenderer extends GeoArmorRenderer<OliveHelmetCM7MArmorItem> {
    public OliveHelmetCM7MRenderer() {
        super(new OliveHelmetCM7MModel());
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
