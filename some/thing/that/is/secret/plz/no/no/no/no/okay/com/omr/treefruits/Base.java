package com.omr.treefruits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Base extends JavaPlugin {

    public static Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new BreakLeaves(), this);
        log.severe(ChatColor.BLUE + "Plugin Enabled > " + ChatColor.YELLOW + "TreeFruits : Break leaves and get some fruits!");
    }

    @Override
    public void onDisable(){
        log.severe(ChatColor.BLUE + "Plugin Disabled > " + ChatColor.YELLOW + "TreeFruits : See you soon!");
    }

}
