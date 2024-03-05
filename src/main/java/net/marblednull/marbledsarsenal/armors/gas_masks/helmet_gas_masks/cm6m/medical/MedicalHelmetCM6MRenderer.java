package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.medical;


import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.medical.MedicalHelmetCM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalHelmetCM6MRenderer extends GeoArmorRenderer<MedicalHelmetCM6MArmorItem> {
    public MedicalHelmetCM6MRenderer() {
        super(new MedicalHelmetCM6MModel());
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
