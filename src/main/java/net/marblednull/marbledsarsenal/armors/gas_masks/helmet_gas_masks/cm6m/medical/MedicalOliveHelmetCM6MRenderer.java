package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalOliveHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.MedicalOliveHelmetCM8MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalOliveHelmetCM6MRenderer extends GeoArmorRenderer<MedicalOliveHelmetCM6MArmorItem> {
    public MedicalOliveHelmetCM6MRenderer() {
        super(new MedicalOliveHelmetCM6MModel());
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
