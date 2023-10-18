package me.widdleljk.blockbreakupdate;

import me.widdleljk.blockbreakupdate.listeners.BlockBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockBreakUpdate extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Starting up!");
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Stopping!");
    }
}
