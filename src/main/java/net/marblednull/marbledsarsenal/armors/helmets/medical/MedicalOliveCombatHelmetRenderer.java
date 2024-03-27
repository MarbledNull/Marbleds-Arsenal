package net.marblednull.marbledsarsenal.armors.helmets.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.MedicalOliveCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.OliveCombatHelmetArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalOliveCombatHelmetRenderer extends GeoArmorRenderer<MedicalOliveCombatHelmetArmorItem> {
    public MedicalOliveCombatHelmetRenderer() {
        super(new MedicalOliveCombatHelmetModel());
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
