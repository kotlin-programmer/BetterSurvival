package com.mujmajnkraft.bettersurvival.config;

import com.mujmajnkraft.bettersurvival.BetterSurvival;
import com.mujmajnkraft.bettersurvival.Reference;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Level;

import java.util.ArrayList;
import java.util.List;

@Config(modid = Reference.MOD_ID)
public class ForgeConfigHandler {

    @Config.Comment("Weapon Config (server)")
    @Config.Name("Weapons")
    @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons")
    public static final WeaponConfig weapons = new WeaponConfig();
    
    @Config.Comment("Potion Config (server)")
    @Config.Name("Potions")
    @Config.LangKey("config.mujmajnkraftsbettersurvival.potions")
    public static final PotionConfig potions = new PotionConfig();
    
    @Config.Comment("Enchantment Config (server)")
    @Config.Name("Enchantments")
    @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments")
    public static final EnchantmentConfig enchantments = new EnchantmentConfig();
    
    @Config.Comment("Material Config (server)")
    @Config.Name("Materials")
    @Config.LangKey("config.mujmajnkraftsbettersurvival.materials")
    public static final MaterialConfig materials = new MaterialConfig();

    @Config.Comment("Client Config")
    @Config.Name("Client")
    @Config.LangKey("config.mujmajnkraftsbettersurvival.client")
    public static final ClientConfig client = new ClientConfig();
    
    public static class EnchantmentConfig {
    	@Config.Name("Assassinate max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.assassinteLevel")
        @Config.RangeInt(min = 0, max = 10)
    	public int assassinteLevel = 3;

        @Config.Name("Agility max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.agilityLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int agilityLevel = 2;

        @Config.Name("Arrow Recovery max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.arrowRecoveryLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int arrowRecoveryLevel = 3;

        @Config.Name("Bash max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.bashLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int bashLevel = 3;

        @Config.Name("Blast max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.blastLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int blastLevel = 2;

        @Config.Name("Blocking Power max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.blockingPowerLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int blockingPowerLevel = 3;
        
        @Config.Name("Combo max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.comboLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int comboLevel = 3;

        @Config.Name("Diamonds Everywhere max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.diamondsEverywhereLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int diamondsEverywhereLevel = 3;

        @Config.Name("Disarm max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.disarmLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int disarmLevel = 1;

        @Config.Name("Education max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.educationLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int educationLevel = 3;

        @Config.Name("Fling max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.flingLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int flingLevel = 2;

        @Config.Name("Heavy max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.heavyLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int heavyLevel = 1;

        @Config.Name("High Jump max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.highJumpLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int highJumpLevel = 2;

        @Config.Name("Multishot max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.multishotLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int multishotLevel = 3;

        @Config.Name("Penetration max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.penetrationLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int penetrationLevel = 5;

        @Config.Name("Range max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.rangeLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int rangeLevel = 1;

        @Config.Name("Rapid Fire max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.rapidFireLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int rapidFireLevel = 5;

        @Config.Name("Reflection max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.reflectionLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int reflectionLevel = 3;

        @Config.Name("Smelting max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.smeltingLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int smeltingLevel = 1;

        @Config.Name("Spell Shield max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.spellShieldLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int spellShieldLevel = 3;

        @Config.Name("Tunneling max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.tunnelingLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int tunnelingLevel = 2;

        @Config.Name("Vampirism max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.vampirismLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int vampirismLevel = 1;

        @Config.Name("Versatility max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.versatilityLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int versatilityLevel = 1;

        @Config.Name("Vitality max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.vitalityLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int vitalityLevel = 1;

        @Config.Name("Weightless max level")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.weightlessLevel")
        @Config.RangeInt(min = 0, max = 10)
        public int weightlessLevel = 1;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Assassinate treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.assassinteTreasure")
        public boolean assassinteTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Agility treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.agilityTreasure")
        public boolean agilityTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Arrow Recovery treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.arrowRecoveryTreasure")
        public boolean arrowRecoveryTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Bash treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.bashTreasure")
        public boolean bashTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Blast treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.blastTreasure")
        public boolean blastTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Blocking Power treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.blockingPowerTreasure")
        public boolean blockingPowerTreasure = false;
        
        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Combo treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.comboTreasure")
        public boolean comboTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Diamonds Everywhere treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.diamondsEverywhereTreasure")
        public boolean diamondsEverywhereTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Disarm treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.disarmTreasure")
        public boolean disarmTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Education treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.educationTreasure")
        public boolean educationTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Fling treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.flingTreasure")
        public boolean flingTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Heavy treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.heavyTreasure")
        public boolean heavyTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("High Jump treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.highJumpTreasure")
        public boolean highJumpTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Multishot treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.multishotTreasure")
        public boolean multishotTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Penetration treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.penetrationTreasure")
        public boolean penetrationTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Range treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.rangeTreasure")
        public boolean rangeTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Rapid Fire treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.rapidFireTreasure")
        public boolean rapidFireTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Reflection treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.reflectionTreasure")
        public boolean reflectionTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Smelting treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.smeltingTreasure")
        public boolean smeltingTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Spell Shield treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.spellShieldTreasure")
        public boolean spellShieldTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Tunneling treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.tunnelingTreasure")
        public boolean tunnelingTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Vampirism treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.vampirismTreasure")
        public boolean vampirismTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Versatility treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.versatilityTreasure")
        public boolean versatilityTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Vitality treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.vitalityTreasure")
        public boolean vitalityTreasure = false;

        @Config.Comment("Whether or not is this enchantment a treasure enchantment (exclusive to loot and trading).")
        @Config.Name("Weightless treasure")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.weightlessTreasure")
        public boolean weightlessTreasure = false;
        
        @Config.Comment("Multiplier of arrow velocity for the Range enchantment.")
        @Config.Name("Range Multiplier")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.rangeVelocity")
        @Config.RangeDouble(min = 1.0, max = 10.0)
        public double rangeVelocity = 1.5D;

        @Config.Comment("Prevent Tunneling enchantment from attempting to mine TileEntities.")
        @Config.Name("Tunneling ignores TileEntities")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.enchantments.preventTunnelingTileEntities")
        public boolean preventTunnelingTileEntities = true;
    }
    
    public static class PotionConfig {
    	@Config.Comment("How much should Blindness reduce mobs view distance (Percentage)")
        @Config.Name("Blindness Strength")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.potions.blindnessStrength")
        @Config.RangeDouble(min = 0.0, max = 100.0)
        public double blindnessStrength = 80.0;

        @Config.Comment("Blacklist of mobs to not affect with Blindness.")
        @Config.Name("Blindness Blacklist")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.potions.blindnessBlacklist")
        public String[] blindnessBlacklist = new String[]{""};
        
        @Config.Comment("When applying a potion to a weapon, how many hits should a dose give on the weapon.")
        @Config.Name("Potion Hits Amount")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.potions.potionHits")
        @Config.RangeInt(min = 1, max = 256)
        public int potionHits = 64;

        @Config.Comment("Maximum number of hits to apply to a weapon with repeated doses.")
        @Config.Name("Maximum Potion Hits")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.potions.maximumPotionHits")
        @Config.RangeInt(min = 1, max = 512)
        public int maximumPotionHits = 64;

        @Config.Comment("When applying a potion to a weapon, what to divide the potion's time by for a single dose.")
        @Config.Name("Potion Timer Divider")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.potions.potionDivisor")
        @Config.RangeInt(min = 1, max = 256)
        public int potionDivisor = 8;

        @Config.Comment("Whitelist of weapons classes that can have potions applied to them.")
        @Config.Name("Potion-Applying Weapon Whitelist")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.potions.paWeaponWhitelist")
        public String[] paWeaponWhitelist = new String[]{"net.minecraft.item.ItemSword", "com.mujmajnkraft.bettersurvival.items.ItemCustomWeapon"};

        @Config.Comment("Blacklist of potions that can be applied to weapons.")
        @Config.Name("Potion-Applying Potion Blacklist")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.potions.paPotionBlacklist")
        public String[] paPotionBlacklist = new String[]{""};
        
        private List<Class<?>> weaponWhitelist = null;
        
        public boolean isClassInstanceofWhitelistedWeapon(Class<?> clazz) {
            return ForgeConfigHandler.potions.getWeaponWhitelistClasses().stream().anyMatch(w -> w.isAssignableFrom(clazz));
        }

        private List<Class<?>> getWeaponWhitelistClasses() {
            if(weaponWhitelist==null) {
                weaponWhitelist = new ArrayList<>();
                for(String name : paWeaponWhitelist) {
                    try { weaponWhitelist.add(Class.forName(name)); }
                    catch(Exception ex) { BetterSurvival.LOG.log(Level.WARN, "Failed to parse weapon whitelist entry: " + name); }
                }
            }
            return weaponWhitelist;
        }

        public void refreshCache() { weaponWhitelist = null; }
    }
    
    public static class MaterialConfig {
    	@Config.Comment("Allows you to craft weapons from materials from other mods.")
	    @Config.Name("Modded materials")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.moddedMaterials")
	    @Config.RequiresMcRestart
	    public boolean moddedMaterials = true;
    	
    	//Material stats
        @Config.Comment("Set stats of copper material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Copper stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.copperStats")
        @Config.RequiresMcRestart
        public Double[] copperStats = new Double[]{1d, 160d, 5.0d, 1.0d, 5d};
        
        @Config.Comment("Set stats of bronze material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Brone stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.bronzeStats")
        @Config.RequiresMcRestart
        public Double[] bronzeStats = new Double[]{2d, 200d, 6.0d, 1.8d, 14d};
        
        @Config.Comment("Set stats of invar material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Invar stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.invarStats")
        @Config.RequiresMcRestart
        public Double[] invarStats = new Double[]{2d, 250d, 6.5d, 2.1d, 10d};

        @Config.Comment("Set stats of silver material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Silver stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.silverStats")
        @Config.RequiresMcRestart
        public Double[] silverStats = new Double[]{0d, 32d, 12.0d, 0.5d, 22d};

        @Config.Comment("Set stats of electrum material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Electrum stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.electrumStats")
        @Config.RequiresMcRestart
        public Double[] electrumStats = new Double[]{0d, 32d, 15.0d, 0.6d, 35d};

        @Config.Comment("Set stats of aluminium material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Aluminium stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.aluminiumStats")
        @Config.RequiresMcRestart
        public Double[] aluminiumStats = new Double[]{2d, 220d, 12.0d, 1.8d, 14d};

        @Config.Comment("Set stats of steel material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Steel stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.steelStats")
        @Config.RequiresMcRestart
        public Double[] steelStats = new Double[]{2d, 350d, 6.5d, 2.5d, 14d};

        @Config.Comment("Set stats of signalum material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Signalum stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.signalumStats")
        @Config.RequiresMcRestart
        public Double[] signalumStats = new Double[]{2d, 500d, 10.0d, 2.0d, 14d};

        @Config.Comment("Set stats of limium material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Lumium stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.lumiumStats")
        @Config.RequiresMcRestart
        public Double[] lumiumStats = new Double[]{2d, 600d, 12.0d, 2.5d, 14d};

        @Config.Comment("Set stats of enderium material (harvest level, durability, efficiency, damage, enchantability)")
        @Config.Name("Enderium stats")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.materials.enderiumStats")
        @Config.RequiresMcRestart
        public Double[] enderiumStats = new Double[]{3d, 1000d, 10.0d, 4.0d, 20d};
    }    

    public static class WeaponConfig {
    	
    	final String damageModifierDesc = "Set damage stat modifere for the weapon";
    	final String speedModifierDesc = "Set speed stat modifere for the weapon";
        
        //Weapon stats
    	@Config.Comment("Extra attack reach given to spears.")
        @Config.Name("Extra reach base")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.spearReachBonus")
    	@Config.RequiresMcRestart
        public float spearReachBonus = 2.0F;
    	
        @Config.Comment("Chance per full-strength hammer hit that Stun procs.")
        @Config.Name("Stun Base Chance")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.stunBaseChance")
        public float stunBaseChance = 0.1F;

        @Config.Comment("Increased Stun chance per level of Bash")
        @Config.Name("Bash Stun Modifier")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.bashModifier")
        public float bashModifier = 0.05F;

        @Config.Comment("Chance per full-strength battleaxe hit that Disarm procs.")
        @Config.Name("Disarm Base Chance")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.disarmBaseChance")
        public float disarmBaseChance = 0.1F;

        @Config.Comment("Increased Disarm chance per level of Disarming")
        @Config.Name("Disarming chance Modifier")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.disarmModifier")
        public float disarmModifier = 0.05F;
        
        @Config.Comment(damageModifierDesc)
        @Config.Name("Battle Axe damage modifier")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.battleAxeDmgMod")
        @Config.RequiresMcRestart
        public float battleAxeDmgMod = 1.6f;

        @Config.Comment(damageModifierDesc)
        @Config.Name("Nunchaku damage modifier")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.nunchakuDmgMod")
        @Config.RequiresMcRestart
        public float nunchakuDmgMod = 0.5F;

        @Config.Comment(damageModifierDesc)
        @Config.Name("Hammer damage modifier")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.hammerDmgMod")
        @Config.RequiresMcRestart
        public float hammerDmgMod = 1.2F;

        @Config.Comment(damageModifierDesc)
        @Config.Name("Dagger damage modifier")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.daggerDmgMod")
        @Config.RequiresMcRestart
        public float daggerDmgMod = 0.7F;

        @Config.Comment(damageModifierDesc)
        @Config.Name("Spear damage")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.spearDmgMod")
        @Config.RequiresMcRestart
        public float spearDmgMod = 0.75F;

        @Config.Comment(damageModifierDesc)
        @Config.Name("Crossbow damage")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.crossbowDmgMod")
        public float crossbowDmgMod = 2.0F;
        
        @Config.Comment(speedModifierDesc)
        @Config.Name("Battle Axe attack delay")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.battleAxeSpd")
        @Config.RequiresMcRestart
        public float battleAxeSpd = 1.25F;

        @Config.Comment(speedModifierDesc)
        @Config.Name("Nunchaku attack delay")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.nunchakuSpd")
        @Config.RequiresMcRestart
        public float nunchakuSpd = 0.3F;

        @Config.Comment(speedModifierDesc)
        @Config.Name("Hammer attack delay")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.hammerSpd")
        @Config.RequiresMcRestart
        public float hammerSpd = 1.35F;

        @Config.Comment(speedModifierDesc)
        @Config.Name("Dagger attack delay")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.daggerSpd")
        @Config.RequiresMcRestart
        public float daggerSpd = 0.8F;

        @Config.Comment(speedModifierDesc)
        @Config.Name("Spear attack delay")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.spearSpd")
        @Config.RequiresMcRestart
        public float spearSpd = 1.0F;

        @Config.Comment(speedModifierDesc)
        @Config.Name("Crossbow realoding time")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.crossbowSpd")
        public int crossbowSpd = 40;

        @Config.Comment("When set to false, disable Vanilla shield recipe, forcing player to use this mod's shields.")
        @Config.Name("Allow Vanilla Shields")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.weapons.allowVanillaShields")
        @Config.RequiresMcRestart
        public boolean allowVanillaShields = true;
    }

    public static class ClientConfig {
        @Config.Comment("Prevent custom shields from messing up your FoV. This will cause problems with other mods that change FoV.")
        @Config.Name("Custom Shield FOV")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.client.fovShields")
        public boolean fovShields = true;

        @Config.Comment("Prevent FoV changes completely.")
        @Config.Name("Static FOV")
        @Config.LangKey("config.mujmajnkraftsbettersurvival.client.staticFOV")
        public boolean staticFOV = false;
    }

    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    private static class EventHandler{
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if(event.getModID().equals(Reference.MOD_ID)) {
                ForgeConfigHandler.potions.refreshCache();
                ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}
