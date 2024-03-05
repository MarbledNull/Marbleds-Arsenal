package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.medical;


import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.medical.MedicalOliveHelmetCM7MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalOliveHelmetCM7MRenderer extends GeoArmorRenderer<MedicalOliveHelmetCM7MArmorItem> {
    public MedicalOliveHelmetCM7MRenderer() {
        super(new MedicalOliveHelmetCM7MModel());
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
