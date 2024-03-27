package net.marblednull.marbledsarsenal.armors.gas_masks.gp5;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackGP5Renderer extends GeoArmorRenderer<BlackGP5ArmorItem> {
    public BlackGP5Renderer() {
        super(new BlackGP5Model());
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
