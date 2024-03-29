package net.marblednull.marbledsarsenal.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ArmorMaterialsMA implements ArmorMaterial {

    //Leather 1-3 Tiers
    LEATHER1("leather1", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.LEATHER);
    }),
    LEATHER2("leather2", 6, new int[]{2, 3, 4, 2}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.LEATHER);
    }),
    LEATHER3("leather3", 7, new int[]{3, 4, 5, 3}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.1F, 0.0F, () -> {
        return Ingredient.of(Items.LEATHER);
    }),
    LEATHER4("leather4", 7, new int[]{4, 5, 6, 4}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.1F, 0.1F, () -> {
        return Ingredient.of(Items.LEATHER);
    }),
    //Iron 1-3 Tiers
    IRON1("iron1", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    IRON2("iron2", 15, new int[]{3, 6, 7, 3}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.1F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    IRON3("iron3", 15, new int[]{4, 7, 8, 4}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.1F, 0.1F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    IRON4("iron4", 15, new int[]{5, 7, 8, 4}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.2F, 0.1F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    IRON5("iron5", 15, new int[]{6, 8, 9, 5}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.2F, 0.1F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),


    GOLD1("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),


    //Diamond 1-4 Tiers
    DIAMOND1("diamond1", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    DIAMOND2("diamond2", 33, new int[]{4, 7, 9, 4}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    DIAMOND3("diamond3", 33, new int[]{5, 8, 10, 5}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    DIAMOND4("diamond4", 33, new int[]{6, 9, 11, 6}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.2F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    DIAMOND5("diamond5", 33, new int[]{7, 9, 11, 7}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.3F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),


    TURTLE1("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.SCUTE);
    }),


    NETHERITE1("netherite1", 37, new int[]{3, 6, 6, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),
    NETHERITE2("netherite2", 37, new int[]{4, 7, 8, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),
    NETHERITE3("netherite3", 37, new int[]{5, 8, 9, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),
    NETHERITE4("netherite4", 37, new int[]{6, 9, 10, 6}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),
    NETHERITE5("netherite5", 37, new int[]{7, 10, 11, 7}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.4F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),

    ;private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ArmorMaterialsMA(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}