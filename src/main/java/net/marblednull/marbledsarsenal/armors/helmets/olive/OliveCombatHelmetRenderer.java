package net.marblednull.marbledsarsenal.armors.helmets.olive;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.OliveCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OliveCombatHelmetRenderer extends GeoArmorRenderer<OliveCombatHelmetArmorItem> {
    public OliveCombatHelmetRenderer() {
        super(new OliveCombatHelmetModel());
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
