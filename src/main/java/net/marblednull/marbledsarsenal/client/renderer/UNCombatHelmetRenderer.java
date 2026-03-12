package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CombatHelmetModel;
import net.marblednull.marbledsarsenal.client.model.UNCombatHelmetModel;
import net.marblednull.marbledsarsenal.init.item.CombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.item.UNCombatHelmetArmorItem;
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