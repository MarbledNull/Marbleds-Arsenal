package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CM6MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.CM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CM6MRenderer extends GeoArmorRenderer<CM6MArmorItem> {
    public CM6MRenderer() {
        super(new CM6MModel());
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
