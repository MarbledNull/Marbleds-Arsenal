package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.SwatArmorModel;
import net.marblednull.marbledsarsenal.init.item.SwatArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SwatArmorRenderer extends GeoArmorRenderer<SwatArmorItem> {
    public SwatArmorRenderer() {
        super(new SwatArmorModel());
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
