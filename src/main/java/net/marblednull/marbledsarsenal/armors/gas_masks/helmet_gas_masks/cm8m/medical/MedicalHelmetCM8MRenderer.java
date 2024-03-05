package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.medical;


import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.medical.MedicalHelmetCM8MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalHelmetCM8MRenderer extends GeoArmorRenderer<MedicalHelmetCM8MArmorItem> {
    public MedicalHelmetCM8MRenderer() {
        super(new MedicalHelmetCM8MModel());
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
