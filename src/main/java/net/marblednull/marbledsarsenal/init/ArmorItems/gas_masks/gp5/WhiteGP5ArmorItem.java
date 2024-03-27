package net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5;

import net.marblednull.marbledsarsenal.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhiteGP5ArmorItem extends GeoArmorItem implements IAnimatable {
    public AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public WhiteGP5ArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
        super(materialIn, slot, builder);
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        LivingEntity livingEntity = event.getExtraDataOfType(LivingEntity.class).get(0);

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gp5.idle", true));

        if (livingEntity instanceof ArmorStandEntity) {
            return PlayState.CONTINUE;
        }


        List<Item> armorList = new ArrayList<>(4);
        for(EquipmentSlotType slot : EquipmentSlotType.values()) {
            if(slot.getType() == EquipmentSlotType.Group.ARMOR) {
                if(livingEntity.getItemBySlot(slot) != null) {
                    armorList.add(livingEntity.getItemBySlot(slot).getItem());
                }
            }
        }

        boolean isWearingAll = armorList
                .containsAll(Arrays.asList(ModItems.WHITE_GP5_GAS_MASK.get()));
        return isWearingAll ? PlayState.CONTINUE : PlayState.STOP;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new
                AnimationController<WhiteGP5ArmorItem>
                (this, "controller", 20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}