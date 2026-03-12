package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CombatHelmetModel;
import net.marblednull.marbledsarsenal.client.model.OliveCombatHelmetModel;
import net.marblednull.marbledsarsenal.init.item.CombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.item.OliveCombatHelmetArmorItem;
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