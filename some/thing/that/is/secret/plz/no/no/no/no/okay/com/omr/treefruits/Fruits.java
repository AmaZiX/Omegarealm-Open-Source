package com.omr.treefruits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Fruits {

    public static ItemStack peach(){
        ItemStack peach = new ItemStack(Material.APPLE);
        ItemMeta meta = peach.getItemMeta();
        meta.setDisplayName("" + ChatColor.LIGHT_PURPLE + "Peach");
        peach.setItemMeta(meta);

        return peach;
    }

    public static ItemStack orange(){
        ItemStack orange = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta meta = orange.getItemMeta();
        meta.setDisplayName("" + ChatColor.GOLD + "Orange");
        orange.setItemMeta(meta);

        return orange;
    }

    public static ItemStack plum(){
        ItemStack plum = new ItemStack(Material.APPLE);
        ItemMeta meta = plum.getItemMeta();
        meta.setDisplayName("" + ChatColor.DARK_PURPLE + "Plum");
        plum.setItemMeta(meta);

        return plum;
    }

    public static ItemStack passion(){
        ItemStack passion = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta meta = passion.getItemMeta();
        meta.setDisplayName("" + ChatColor.YELLOW + "Passion Fruit");
        passion.setItemMeta(meta);

        return passion;
    }

}
