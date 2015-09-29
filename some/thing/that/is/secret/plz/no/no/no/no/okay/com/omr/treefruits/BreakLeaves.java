package com.omr.treefruits;

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
            if(percent < 0.75){
                p.getInventory().addItem(Fruits.peach());
            } else if (percent < 0.8) {
                p.getInventory().addItem(Fruits.plum());
            } else if (percent < 0.9) {
                p.getInventory().addItem(Fruits.orange());
            } else if (percent < 0.95) {
                p.getInventory().addItem(Fruits.passion());
            } else {

            }
        }
    }

}
