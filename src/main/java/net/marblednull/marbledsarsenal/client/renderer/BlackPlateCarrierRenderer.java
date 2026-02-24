package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BlackPlateCarrierModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.BlackPlateCarrierArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackPlateCarrierRenderer extends GeoArmorRenderer<BlackPlateCarrierArmorItem> {
    public BlackPlateCarrierRenderer() {
        super(new BlackPlateCarrierModel());
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
