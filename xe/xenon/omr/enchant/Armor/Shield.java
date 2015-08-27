package xe.xenon.omr.enchant.Armor;

import com.rit.sucy.CustomEnchantment;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Shield extends CustomEnchantment {

    static final Material[] ShieldItems = new Material[]{
            Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.GOLD_HELMET, Material.GOLD_CHESTPLATE, Material.GOLD_LEGGINGS, Material.GOLD_BOOTS, Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS
    };

    public Shield(){
        super("Shield", "Gives you an extra heart according to the level", ShieldItems);

        this.max = 5;
        this.base = 1;
        this.interval = 10;
    }

    @Override
    public void applyEquipEffect(Player p, int l){
        int heart = 2 * l;
        p.setHealthScale(p.getHealthScale() + heart);
        p.setHealth(p.getHealth() + heart);
    }

    @Override
    public void applyUnequipEffect(Player p, int l){
        int deheart = 2 * l;
        p.setHealthScale(p.getHealthScale() - deheart);
        p.setHealth(p.getHealth() - deheart + deheart);
    }

}
