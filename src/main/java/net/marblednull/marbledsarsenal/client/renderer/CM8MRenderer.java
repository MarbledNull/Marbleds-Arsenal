package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CM8MModel;
import net.marblednull.marbledsarsenal.init.item.CM8MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CM8MRenderer extends GeoArmorRenderer<CM8MArmorItem> {
    public CM8MRenderer() {
        super(new CM8MModel());
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
