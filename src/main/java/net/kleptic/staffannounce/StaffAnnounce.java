package net.kleptic.staffannounce;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;

public final class StaffAnnounce extends Plugin {
    
    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new StaffAnnounceCommand("staffsay", this));
    }
    
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

