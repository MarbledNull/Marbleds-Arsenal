package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.WinterMilitaryArmorModel;
import net.marblednull.marbledsarsenal.init.item.WinterMilitaryArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WinterMilitaryArmorRenderer extends GeoArmorRenderer<WinterMilitaryArmorItem> {
    public WinterMilitaryArmorRenderer() {
        super(new WinterMilitaryArmorModel());
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
