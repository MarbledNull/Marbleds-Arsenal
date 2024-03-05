package net.marblednull.marbledsarsenal.armors.helmets.medical;


import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalUNCombatHelmetArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalUNCombatHelmetRenderer extends GeoArmorRenderer<MedicalUNCombatHelmetArmorItem> {
    public MedicalUNCombatHelmetRenderer() {
        super(new MedicalUNCombatHelmetModel());
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
