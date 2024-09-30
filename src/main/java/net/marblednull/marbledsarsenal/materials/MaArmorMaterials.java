package net.marblednull.marbledsarsenal.materials;

import net.marblednull.mcore.MarbledsCore;
import net.marblednull.mcore.init.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public enum MaArmorMaterials implements ArmorMaterial {

    HAT("hat", 10, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () ->
            Ingredient.of(new ItemLike[]{Items.LEATHER})),

    COMBAT_HELMET("combat_helmet", 20, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),

    PLATE_CARRIER_LIGHT("plate_carrier_light", 20, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),

    PLATE_CARRIER_HEAVY("plate_carrier_heavy", 20, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),

    GAS_MASK("gas_mask", 15, new int[]{2, 6, 5, 2}, 15,
                SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),

    HAZMAT("hazmat", 13, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () ->
            Ingredient.of(new ItemLike[]{Items.LEATHER})),
    GHILLIE("ghillie", 10, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () ->
            Ingredient.of(new ItemLike[]{Items.LEATHER})),

    POLICEFORCE("policeforce", 25, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),

    MILITARY("military", 33, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),

    JUGGERNAUT("juggernaut", 37, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3f, 0.2f, () ->
            Ingredient.of(ModItems.TITANIUM_INGOT.get())),


    STEEL("steel", 33, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),

    TITANIUM("titanium", 15, new int[]{3, 6, 8, 3}, 10,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3f, 0.1f, () ->
            Ingredient.of(ModItems.TITANIUM_INGOT.get()));

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    MaArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MarbledsCore.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
