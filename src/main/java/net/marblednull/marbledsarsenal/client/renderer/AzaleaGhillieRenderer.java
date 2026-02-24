package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.AzaleaGhillieArmorModel;
import net.marblednull.marbledsarsenal.client.model.OakGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.AzaleaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.OakGhillieArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AzaleaGhillieRenderer extends GeoArmorRenderer<AzaleaGhillieArmorItem> {
    public AzaleaGhillieRenderer() {
        super(new AzaleaGhillieArmorModel());
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
