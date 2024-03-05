package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.medical;


import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.medical.MedicalUNHelmetCM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalUNHelmetCM6MRenderer extends GeoArmorRenderer<MedicalUNHelmetCM6MArmorItem> {
    public MedicalUNHelmetCM6MRenderer() {
        super(new MedicalUNHelmetCM6MModel());
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
