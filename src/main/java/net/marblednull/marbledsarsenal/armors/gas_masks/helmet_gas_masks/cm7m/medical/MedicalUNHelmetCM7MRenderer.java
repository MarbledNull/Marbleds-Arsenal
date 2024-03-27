package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalUNHelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.MedicalUNHelmetCM8MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalUNHelmetCM7MRenderer extends GeoArmorRenderer<MedicalUNHelmetCM7MArmorItem> {
    public MedicalUNHelmetCM7MRenderer() {
        super(new MedicalUNHelmetCM7MModel());
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
