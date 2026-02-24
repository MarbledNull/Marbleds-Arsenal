package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.MangroveGhillieArmorModel;
import net.marblednull.marbledsarsenal.client.model.SpruceGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.MangroveGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.SpruceGhillieArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MangroveGhillieRenderer extends GeoArmorRenderer<MangroveGhillieArmorItem> {
    public MangroveGhillieRenderer() {
        super(new MangroveGhillieArmorModel());
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
