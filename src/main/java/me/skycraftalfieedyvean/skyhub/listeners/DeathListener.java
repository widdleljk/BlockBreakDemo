package me.skycraftalfieedyvean.skyhub.listeners;

import me.skycraftalfieedyvean.skyhub.SkyHub;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class DeathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        new BukkitRunnable(){
            @Override
            public void run() {
                System.out.println("DEAD");
            }
        }.runTaskLater(SkyHub.getPlugin(), 20L);
    }
}
