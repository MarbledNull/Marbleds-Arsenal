package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CombatHelmetModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class UNCombatHelmetRenderer extends GeoArmorRenderer<CombatHelmetArmorItem> {
    public UNCombatHelmetRenderer() {
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