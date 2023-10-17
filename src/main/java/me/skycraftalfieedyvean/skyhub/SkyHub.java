package me.skycraftalfieedyvean.skyhub;

import me.skycraftalfieedyvean.skyhub.commands.SetSpawnCommand;
import me.skycraftalfieedyvean.skyhub.commands.SpawnCommand;
import me.skycraftalfieedyvean.skyhub.listeners.BlockBreakerListener;
import me.skycraftalfieedyvean.skyhub.listeners.PlayerJoinLeaveListener;
import me.skycraftalfieedyvean.skyhub.listeners.SpawnListeners;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyHub extends JavaPlugin {

    private static SkyHub plugin;

    @Override
    public void onEnable() {
        getLogger().info("Starting up!");

        getServer().getPluginManager().registerEvents(new PlayerJoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakerListener(), this);
        getServer().getPluginManager().registerEvents(new SpawnListeners(this), this);

        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));

        plugin = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("Stopping!");
    }

    public static SkyHub getPlugin() {
        return plugin;
    }
}
