package net.marblednull.marbledsarsenal.init;

import net.marblednull.marbledsapi.custom.ArmorMaterialsMAPI;
import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalOliveCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalUNCombatHelmetArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsArsenal.MODID);

    //Gas Masks
    public static final RegistryObject<Item> CM6M_GAS_MASK = ITEMS.register("cm6m_gas_mask", () -> new CM6MArmorItem(ArmorMaterialsMAPI.IRON1, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HELMET_CM6M_GAS_MASK = ITEMS.register("helmet_cm6m_gas_mask", () -> new HelmetCM6MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_HELMET_CM6M_GAS_MASK = ITEMS.register("un_helmet_cm6m_gas_mask", () -> new UNHelmetCM6MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("olive_helmet_cm6m_gas_mask", () -> new OliveHelmetCM6MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_helmet_cm6m_gas_mask", () -> new MedicalHelmetCM6MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_un_helmet_cm6m_gas_mask", () -> new MedicalUNHelmetCM6MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm6m_gas_mask", () -> new MedicalOliveHelmetCM6MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CM7M_GAS_MASK = ITEMS.register("cm7m_gas_mask", () -> new CM7MArmorItem(ArmorMaterialsMAPI.IRON1, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HELMET_CM7M_GAS_MASK = ITEMS.register("helmet_cm7m_gas_mask", () -> new HelmetCM7MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_HELMET_CM7M_GAS_MASK = ITEMS.register("un_helmet_cm7m_gas_mask", () -> new UNHelmetCM7MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("olive_helmet_cm7m_gas_mask", () -> new OliveHelmetCM7MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_helmet_cm7m_gas_mask", () -> new MedicalHelmetCM7MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_un_helmet_cm7m_gas_mask", () -> new MedicalUNHelmetCM7MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm7m_gas_mask", () -> new MedicalOliveHelmetCM7MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CM8M_GAS_MASK = ITEMS.register("cm8m_gas_mask", () -> new CM8MArmorItem(ArmorMaterialsMAPI.IRON1, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HELMET_CM8M_GAS_MASK = ITEMS.register("helmet_cm8m_gas_mask", () -> new HelmetCM8MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_HELMET_CM8M_GAS_MASK = ITEMS.register("un_helmet_cm8m_gas_mask", () -> new UNHelmetCM8MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("olive_helmet_cm8m_gas_mask", () -> new OliveHelmetCM8MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_helmet_cm8m_gas_mask", () -> new MedicalHelmetCM8MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_un_helmet_cm8m_gas_mask", () -> new MedicalUNHelmetCM8MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm8m_gas_mask", () -> new MedicalOliveHelmetCM8MArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> WHITE_GP5_GAS_MASK = ITEMS.register("white_gp5_gas_mask", () -> new WhiteGP5ArmorItem(ArmorMaterialsMAPI.IRON1, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_GP5_GAS_MASK = ITEMS.register("black_gp5_gas_mask", () -> new BlackGP5ArmorItem(ArmorMaterialsMAPI.IRON1, ArmorItem.Type.HELMET, new Item.Properties()));
    //Headwear
    public static final RegistryObject<Item> COMBAT_HELMET = ITEMS.register("combat_helmet", () -> new CombatHelmetArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_COMBAT_HELMET = ITEMS.register("un_combat_helmet", () -> new UNCombatHelmetArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_COMBAT_HELMET = ITEMS.register("olive_combat_helmet", () -> new OliveCombatHelmetArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_COMBAT_HELMET = ITEMS.register("medical_combat_helmet", () -> new MedicalCombatHelmetArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_UN_COMBAT_HELMET = ITEMS.register("medical_un_combat_helmet", () -> new MedicalUNCombatHelmetArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MEDICAL_OLIVE_COMBAT_HELMET = ITEMS.register("medical_olive_combat_helmet", () -> new MedicalOliveCombatHelmetArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> BLACK_MILITARY_BERET = ITEMS.register("black_military_beret", () -> new BlackMilitaryBeretArmorItem(ArmorMaterialsMAPI.LEATHER3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RED_MILITARY_BERET = ITEMS.register("red_military_beret", () -> new RedMilitaryBeretArmorItem(ArmorMaterialsMAPI.LEATHER3, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_MILITARY_BERET = ITEMS.register("un_military_beret", () -> new UNMilitaryBeretArmorItem(ArmorMaterialsMAPI.LEATHER3, ArmorItem.Type.HELMET, new Item.Properties()));

    //Body Armors
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T1 = ITEMS.register("black_plate_carrier_t1", () -> new BlackPlateCarrierArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T2 = ITEMS.register("black_plate_carrier_t2", () -> new BlackPlateCarrierArmorItem(ArmorMaterialsMAPI.IRON4, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T3 = ITEMS.register("black_plate_carrier_t3", () -> new BlackPlateCarrierArmorItem(ArmorMaterialsMAPI.IRON5, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T1 = ITEMS.register("olive_plate_carrier_t1", () -> new OlivePlateCarrierArmorItem(ArmorMaterialsMAPI.IRON3, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T2 = ITEMS.register("olive_plate_carrier_t2", () -> new OlivePlateCarrierArmorItem(ArmorMaterialsMAPI.IRON4, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T3 = ITEMS.register("olive_plate_carrier_t3", () -> new OlivePlateCarrierArmorItem(ArmorMaterialsMAPI.IRON5, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    //Full Suits
    public static final RegistryObject<Item> RIOT_ARMOR_HELMET = ITEMS.register("riot_armor_helmet", () -> new RiotArmorItem(ArmorMaterialsMAPI.DIAMOND4, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RIOT_ARMOR_CHESTPLATE = ITEMS.register("riot_armor_chestplate", () -> new RiotArmorItem(ArmorMaterialsMAPI.DIAMOND4, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RIOT_ARMOR_LEGGINGS = ITEMS.register("riot_armor_leggings", () -> new RiotArmorItem(ArmorMaterialsMAPI.DIAMOND4, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RIOT_ARMOR_BOOTS = ITEMS.register("riot_armor_boots", () -> new RiotArmorItem(ArmorMaterialsMAPI.DIAMOND4, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_HELMET = ITEMS.register("winter_military_armor_helmet", () -> new WinterMilitaryArmorItem(ArmorMaterialsMAPI.DIAMOND5, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("winter_military_armor_chestplate", () -> new WinterMilitaryArmorItem(ArmorMaterialsMAPI.DIAMOND5, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_LEGGINGS = ITEMS.register("winter_military_armor_leggings", () -> new WinterMilitaryArmorItem(ArmorMaterialsMAPI.DIAMOND5, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_BOOTS = ITEMS.register("winter_military_armor_boots", () -> new WinterMilitaryArmorItem(ArmorMaterialsMAPI.DIAMOND5, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_HELMET = ITEMS.register("desert_military_armor_helmet", () -> new DesertMilitaryArmorItem(ArmorMaterialsMAPI.DIAMOND5, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("desert_military_armor_chestplate", () -> new DesertMilitaryArmorItem(ArmorMaterialsMAPI.DIAMOND5, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_LEGGINGS = ITEMS.register("desert_military_armor_leggings", () -> new DesertMilitaryArmorItem(ArmorMaterialsMAPI.DIAMOND5, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_BOOTS = ITEMS.register("desert_military_armor_boots", () -> new DesertMilitaryArmorItem(ArmorMaterialsMAPI.DIAMOND5, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SWAT_ARMOR_HELMET = ITEMS.register("swat_armor_helmet", () -> new SwatArmorItem(ArmorMaterialsMAPI.DIAMOND4, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SWAT_ARMOR_CHESTPLATE = ITEMS.register("swat_armor_chestplate", () -> new SwatArmorItem(ArmorMaterialsMAPI.DIAMOND4, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SWAT_ARMOR_LEGGINGS = ITEMS.register("swat_armor_leggings", () -> new SwatArmorItem(ArmorMaterialsMAPI.DIAMOND4, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SWAT_ARMOR_BOOTS = ITEMS.register("swat_armor_boots", () -> new SwatArmorItem(ArmorMaterialsMAPI.DIAMOND4, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HAZMAT_ARMOR_HELMET = ITEMS.register("hazmat_armor_helmet", () -> new HazmatArmorItem(ArmorMaterialsMAPI.LEATHER4, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_ARMOR_CHESTPLATE = ITEMS.register("hazmat_armor_chestplate", () -> new HazmatArmorItem(ArmorMaterialsMAPI.LEATHER4, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_ARMOR_LEGGINGS = ITEMS.register("hazmat_armor_leggings", () -> new HazmatArmorItem(ArmorMaterialsMAPI.LEATHER4, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_ARMOR_BOOTS = ITEMS.register("hazmat_armor_boots", () -> new HazmatArmorItem(ArmorMaterialsMAPI.LEATHER4, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("olive_juggernaut_armor_helmet", () -> new OliveJuggernautArmorItem(ArmorMaterialsMAPI.NETHERITE4, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("olive_juggernaut_armor_chestplate", () -> new OliveJuggernautArmorItem(ArmorMaterialsMAPI.NETHERITE4, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("olive_juggernaut_armor_leggings", () -> new OliveJuggernautArmorItem(ArmorMaterialsMAPI.NETHERITE4, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("olive_juggernaut_armor_boots", () -> new OliveJuggernautArmorItem(ArmorMaterialsMAPI.NETHERITE4, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("black_juggernaut_armor_helmet", () -> new BlackJuggernautArmorItem(ArmorMaterialsMAPI.NETHERITE4, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("black_juggernaut_armor_chestplate", () -> new BlackJuggernautArmorItem(ArmorMaterialsMAPI.NETHERITE4, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("black_juggernaut_armor_leggings", () -> new BlackJuggernautArmorItem(ArmorMaterialsMAPI.NETHERITE4, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("black_juggernaut_armor_boots", () -> new BlackJuggernautArmorItem(ArmorMaterialsMAPI.NETHERITE4, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Tools & Weapons

    //Crafting Items
    public static final RegistryObject<Item> GAS_MASK_FILTER = ITEMS.register("gas_mask_filter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate", () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
