package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CombatHelmetModel;
import net.marblednull.marbledsarsenal.client.model.RedMilitaryBeretModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.CombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.RedMilitaryBeretArmorItem;
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