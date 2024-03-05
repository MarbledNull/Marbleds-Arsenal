package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.medical;


import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.medical.MedicalOliveHelmetCM8MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalOliveHelmetCM8MRenderer extends GeoArmorRenderer<MedicalOliveHelmetCM8MArmorItem> {
    public MedicalOliveHelmetCM8MRenderer() {
        super(new MedicalOliveHelmetCM8MModel());
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
