package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m;


import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.UNHelmetCM8MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class UNHelmetCM8MRenderer extends GeoArmorRenderer<UNHelmetCM8MArmorItem> {
    public UNHelmetCM8MRenderer() {
        super(new UNHelmetCM8MModel());
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
