package com.omr.treefruits;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakLeaves implements Listener {

    @EventHandler
    public void BreakBlock(BlockBreakEvent e){
        Double percent = Math.random();
        Player p = e.getPlayer();
        if(e.getBlock().getType() == Material.LEAVES){
            if(!(p.hasPermission("treefruits.bypass") || p.isOp())) {

                if (!(p.getGameMode() == GameMode.CREATIVE)) {
                    if (percent < 0.05) {
                        p.getInventory().addItem(new ItemStack(Material.SAPLING));
                        e.getBlock().getDrops().clear();
                    } else if (percent < 0.1) {
                        p.getInventory().addItem(new ItemStack(Material.APPLE));
                        e.getBlock().getDrops().clear();
                    } else if (percent < 0.25) {
                        p.getInventory().addItem(Fruits.lychee());
                        e.getBlock().getDrops().clear();
                    } else if (percent < 0.5){
                        p.getInventory().addItem(Fruits.mango());
                        e.getBlock().getDrops().clear();
                    } else if (percent < 0.75) {
                        p.getInventory().addItem(Fruits.peach());
                            e.getBlock().getDrops().clear();
                    } else if (percent < 0.8) {
                        p.getInventory().addItem(Fruits.plum());
                            e.getBlock().getDrops().clear();
                    } else if (percent < 0.9) {
                        p.getInventory().addItem(Fruits.orange());
                        e.getBlock().getDrops().clear();
                    } else if (percent < 0.95) {
                        p.getInventory().addItem(Fruits.passion());
                        e.getBlock().getDrops().clear();
                    }
                } else {
                    e.setCancelled(true);
                    p.sendMessage(ChatColor.BLUE + "BreakLeaves> " + ChatColor.RED + "You need to be in survival mode in order to break leaves");
                }
            } else {
                if (percent < 0.05) {
                    p.getInventory().addItem(new ItemStack(Material.SAPLING));
                    e.getBlock().getDrops().clear();
                } else if (percent < 0.1) {
                    p.getInventory().addItem(new ItemStack(Material.APPLE));
                    e.getBlock().getDrops().clear();
                } else if (percent < 0.25) {
                    p.getInventory().addItem(Fruits.lychee());
                    e.getBlock().getDrops().clear();
                } else if (percent < 0.5){
                    p.getInventory().addItem(Fruits.mango());
                    e.getBlock().getDrops().clear();
                } else if (percent < 0.75) {
                    p.getInventory().addItem(Fruits.peach());
                    e.getBlock().getDrops().clear();
                } else if (percent < 0.8) {
                    p.getInventory().addItem(Fruits.plum());
                    e.getBlock().getDrops().clear();
                } else if (percent < 0.9) {
                    p.getInventory().addItem(Fruits.orange());
                    e.getBlock().getDrops().clear();
                } else if (percent < 0.95) {
                    p.getInventory().addItem(Fruits.passion());
                    e.getBlock().getDrops().clear();
                }
            }
        }
    }

}
