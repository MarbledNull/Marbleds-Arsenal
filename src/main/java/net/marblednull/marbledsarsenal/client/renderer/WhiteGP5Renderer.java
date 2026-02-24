package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.WhiteGP5Model;
import net.marblednull.marbledsarsenal.init.ArmorItems.WhiteGP5ArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WhiteGP5Renderer extends GeoArmorRenderer<WhiteGP5ArmorItem> {
    public WhiteGP5Renderer() {
        super(new WhiteGP5Model());
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
