package net.marblednull.marbledsarsenal.util;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MaArmorMaterials implements IArmorMaterial {


    //Material for hats. Berets, ect
    HAT("hat", 12, new int[]{1, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () -> {
        return Ingredient.of(new IItemProvider[]{Items.LEATHER});
    }),

    //Material for combat helmets
    COMBAT_HELMET("combat_helmet", 20, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
        return Ingredient.of(ModItems.HARDENED_STEEL_INGOT.get());
    }),

    //Material for light plate carriers
    PLATE_CARRIER_LIGHT("plate_carrier_light", 24, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f, () -> {
        return Ingredient.of(ModItems.HARDENED_STEEL_INGOT.get());
    }),

    //Material for heavy plate carriers
    PLATE_CARRIER_HEAVY("plate_carrier_heavy", 24, new int[]{2, 8, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 1.5f, 0.1f, () -> {
        return Ingredient.of(ModItems.HARDENED_STEEL_INGOT.get());
    }),

    //Material for gas masks
    GAS_MASK("gas_mask", 16, new int[]{1, 6, 5, 2}, 15,
                SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
        return Ingredient.of(ModItems.HARDENED_STEEL_INGOT.get());
    }),

    //Material for hazmat armors
    HAZMAT("hazmat", 14, new int[]{1, 3, 2, 1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () -> {
        return Ingredient.of(new IItemProvider[]{Items.LEATHER});
    }),

    //Material for ghillies
    GHILLIE("ghillie", 12, new int[]{1, 3, 2, 1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () -> {
        return Ingredient.of(new IItemProvider[]{Items.LEATHER});
    }),

    //Material for civil/clothing armors. Police, Sheriff, ect
    CIVIL("civil", 14, new int[]{1, 2, 2, 1}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.1f, () -> {
        return Ingredient.of(ModItems.HARDENED_STEEL_INGOT.get());
    }),

    //Material for tactical armors. Swat, Riot, ect
    TACTICAL("tactical", 30, new int[]{3, 7, 5, 3}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.1f, () -> {
        return Ingredient.of(ModItems.HARDENED_STEEL_INGOT.get());
    }),

    //Material for military armors
    MILITARY("military", 36, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.1f, () -> {
        return Ingredient.of(ModItems.HARDENED_STEEL_INGOT.get());
    }),

    //Material for Juggernaut and other beefy armors
    JUGGERNAUT("juggernaut", 42, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3f, 0.2f, () -> {
       return Ingredient.of(ModItems.HARDENED_STEEL_INGOT.get());
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    MaArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlotType slotType) {
        return BASE_DURABILITY[slotType.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType slotType) {
        return this.slotProtections[slotType.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return MarbledsArsenal.MODID + ":" + "mlem";
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
