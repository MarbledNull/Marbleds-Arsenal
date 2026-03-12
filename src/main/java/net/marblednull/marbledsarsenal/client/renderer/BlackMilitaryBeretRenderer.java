package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BlackMilitaryBeretModel;
import net.marblednull.marbledsarsenal.client.model.CombatHelmetModel;
import net.marblednull.marbledsarsenal.init.item.BlackMilitaryBeretArmorItem;
import net.marblednull.marbledsarsenal.init.item.CombatHelmetArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackMilitaryBeretRenderer extends GeoArmorRenderer<BlackMilitaryBeretArmorItem> {
    public BlackMilitaryBeretRenderer() {
        super(new BlackMilitaryBeretModel());
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