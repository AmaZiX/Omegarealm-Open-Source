package xe.xenon.omr.enchant;

import com.rit.sucy.EnchantPlugin;
import com.rit.sucy.EnchantmentAPI;
import xe.xenon.omr.enchant.Armor.Shield;

import java.util.logging.Logger;

public class Main extends EnchantPlugin{
    public static Main plugin;
    public final Logger log = Logger.getLogger("Minecraft");


    @Override
    public void onDisable() {
        log.info("Plugin Disabled!");
        unregisterEnchantments();
    }

    @Override
    public void onEnable() {
        log.info("Plugin Enabled!");
        registerEnchantments();
    }

    @Override
    public void registerEnchantments(){
        EnchantmentAPI.registerCustomEnchantment(new Shield());
    }

    public void unregisterEnchantments(){
        EnchantmentAPI.unregisterCustomEnchantment("Shield");
    }
}
