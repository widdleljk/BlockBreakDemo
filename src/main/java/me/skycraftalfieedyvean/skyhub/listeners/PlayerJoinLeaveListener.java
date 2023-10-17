package me.skycraftalfieedyvean.skyhub.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinLeaveListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.RED + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.YELLOW + " has appeared!");
    }

    @EventHandler
    public void onLeaveBed(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.RED + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.YELLOW + " has vanished from the lobby!");
    }
}
