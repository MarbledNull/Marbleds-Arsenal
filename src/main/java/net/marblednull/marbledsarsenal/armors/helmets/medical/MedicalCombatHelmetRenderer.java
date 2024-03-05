package net.marblednull.marbledsarsenal.armors.helmets.medical;


import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalCombatHelmetArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalCombatHelmetRenderer extends GeoArmorRenderer<MedicalCombatHelmetArmorItem> {
    public MedicalCombatHelmetRenderer() {
        super(new MedicalCombatHelmetModel());
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
