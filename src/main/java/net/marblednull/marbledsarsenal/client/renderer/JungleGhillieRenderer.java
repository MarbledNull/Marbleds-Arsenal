package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.JungleGhillieArmorModel;
import net.marblednull.marbledsarsenal.client.model.SpruceGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.JungleGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.SpruceGhillieArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class JungleGhillieRenderer extends GeoArmorRenderer<JungleGhillieArmorItem> {
    public JungleGhillieRenderer() {
        super(new JungleGhillieArmorModel());
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
