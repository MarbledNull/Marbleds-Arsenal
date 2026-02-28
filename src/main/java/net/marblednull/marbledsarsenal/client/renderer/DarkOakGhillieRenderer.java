package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.DarkOakGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.item.DarkOakGhillieArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class DarkOakGhillieRenderer extends GeoArmorRenderer<DarkOakGhillieArmorItem> {
    public DarkOakGhillieRenderer() {
        super(new DarkOakGhillieArmorModel());
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
