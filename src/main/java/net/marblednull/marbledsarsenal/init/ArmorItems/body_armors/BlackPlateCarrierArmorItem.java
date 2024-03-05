package net.marblednull.marbledsarsenal.init.ArmorItems.body_armors;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class BlackPlateCarrierArmorItem extends GeoArmorItem implements IAnimatable {
    private final AnimationFactory FACTORY = GeckoLibUtil.createFactory(this);


    public BlackPlateCarrierArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.FACTORY;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        return PlayState.STOP;
    }

    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return true;
    }
}