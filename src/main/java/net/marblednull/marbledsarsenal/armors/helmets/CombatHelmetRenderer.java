package net.marblednull.marbledsarsenal.armors.helmets;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CombatHelmetRenderer extends GeoArmorRenderer<CombatHelmetArmorItem> {
    public CombatHelmetRenderer() {
        super(new CombatHelmetModel());
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