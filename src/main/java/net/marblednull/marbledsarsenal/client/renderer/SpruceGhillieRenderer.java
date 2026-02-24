package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OakGhillieArmorModel;
import net.marblednull.marbledsarsenal.client.model.SpruceGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.OakGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.SpruceGhillieArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SpruceGhillieRenderer extends GeoArmorRenderer<SpruceGhillieArmorItem> {
    public SpruceGhillieRenderer() {
        super(new SpruceGhillieArmorModel());
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
