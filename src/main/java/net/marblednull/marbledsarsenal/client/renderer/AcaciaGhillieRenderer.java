package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.AcaciaGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.item.AcaciaGhillieArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AcaciaGhillieRenderer extends GeoArmorRenderer<AcaciaGhillieArmorItem> {
    public AcaciaGhillieRenderer() {
        super(new AcaciaGhillieArmorModel());
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
