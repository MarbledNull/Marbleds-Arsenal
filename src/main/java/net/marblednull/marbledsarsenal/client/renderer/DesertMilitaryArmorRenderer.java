package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.DesertMilitaryArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.DesertMilitaryArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class DesertMilitaryArmorRenderer extends GeoArmorRenderer<DesertMilitaryArmorItem> {
    public DesertMilitaryArmorRenderer() {
        super(new DesertMilitaryArmorModel());
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
