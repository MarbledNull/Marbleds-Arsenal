package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.HazmatArmorModel;
import net.marblednull.marbledsarsenal.init.item.HazmatArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HazmatArmorRenderer extends GeoArmorRenderer<HazmatArmorItem> {
    public HazmatArmorRenderer() {
        super(new HazmatArmorModel());
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
