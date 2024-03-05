package net.marblednull.marbledsarsenal.armors.helmets;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class UNCombatHelmetRenderer extends GeoArmorRenderer<UNCombatHelmetArmorItem> {
    public UNCombatHelmetRenderer() {
        super(new UNCombatHelmetModel());
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