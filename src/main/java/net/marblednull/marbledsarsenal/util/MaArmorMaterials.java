package net.marblednull.marbledsarsenal.util;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public enum MaArmorMaterials implements ArmorMaterial {

    //Material for hats. Berets, ect
    HAT("hat", 12, new int[]{1, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () ->
            Ingredient.of(new ItemLike[]{Items.LEATHER})),

    //Material for combat helmets
    COMBAT_HELMET("combat_helmet", 20, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () ->
            Ingredient.of(net.marblednull.marbledsarsenal.init.ModItems.KEVLAR.get())),

    //Material for light plate carriers
    PLATE_CARRIER_LIGHT("plate_carrier_light", 24, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f, () ->
            Ingredient.of(net.marblednull.marbledsarsenal.init.ModItems.KEVLAR.get())),

    //Material for heavy plate carriers
    PLATE_CARRIER_HEAVY("plate_carrier_heavy", 24, new int[]{2, 8, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 1.5f, 0.1f, () ->
            Ingredient.of(net.marblednull.marbledsarsenal.init.ModItems.KEVLAR.get())),

    //Material for gas masks
    GAS_MASK("gas_mask", 16, new int[]{1, 6, 5, 2}, 15,
                SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () ->
            Ingredient.of(net.marblednull.marbledsarsenal.init.ModItems.KEVLAR.get())),

    //Material for hazmat armors
    HAZMAT("hazmat", 14, new int[]{1, 3, 2, 1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () ->
            Ingredient.of(new ItemLike[]{Items.LEATHER})),

    //Material for ghillies
    GHILLIE("ghillie", 12, new int[]{1, 3, 2, 1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () ->
            Ingredient.of(net.marblednull.marbledsarsenal.init.ModItems.KEVLAR.get())),

    //Material for civil/clothing armors. Police, Sheriff, ect
    CIVIL("civil", 14, new int[]{1, 2, 2, 1}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.1f, () ->
            Ingredient.of(new ItemStack(Items.LEATHER))),

    //Material for tactical armors. Swat, Riot, ect
    TACTICAL("tactical", 30, new int[]{3, 7, 5, 3}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.1f, () ->
            Ingredient.of(net.marblednull.marbledsarsenal.init.ModItems.KEVLAR.get())),

    //Material for military armors
    MILITARY("military", 36, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.1f, () ->
            Ingredient.of(net.marblednull.marbledsarsenal.init.ModItems.KEVLAR.get())),

    //Material for Juggernaut and other beefy armors
    JUGGERNAUT("juggernaut", 42, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3f, 0.2f, () ->
            Ingredient.of(net.marblednull.marbledsarsenal.init.ModItems.KEVLAR.get()));

    private static final int[] BASE_DURABILITY = {13, 16, 15, 11};
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
        return MarbledsArsenal.MODID + ":" + this.name;
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
