package net.marblednull.marbledsarsenal.armors.helmets.berets;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.RedMilitaryBeretArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RedMilitaryBeretRenderer extends GeoArmorRenderer<RedMilitaryBeretArmorItem> {
    public RedMilitaryBeretRenderer() {
        super(new RedMilitaryBeretModel());
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
