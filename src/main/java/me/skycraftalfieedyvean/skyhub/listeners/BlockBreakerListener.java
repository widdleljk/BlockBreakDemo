package me.skycraftalfieedyvean.skyhub.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakerListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        if (!e.getPlayer().hasPermission("skycraft.admin")) {
            e.setCancelled(true);
        }
    }
}
