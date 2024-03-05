package net.marblednull.marbledsarsenal.armors.helmets.beret;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.RedMilitaryBeretArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNMilitaryBeretArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class UNMilitaryBeretRenderer extends GeoArmorRenderer<UNMilitaryBeretArmorItem> {
    public UNMilitaryBeretRenderer() {
        super(new UNMilitaryBeretModel());
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
