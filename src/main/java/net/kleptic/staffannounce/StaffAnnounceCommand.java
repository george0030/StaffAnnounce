package net.kleptic.staffannounce;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public final class StaffAnnounceCommand extends Command {
    
    StaffAnnounce plugin;
    
    public StaffAnnounceCommand(String name, StaffAnnounce plugin) {
        super(name);
        this.plugin = plugin;
    }
    
    @Override
    public void execute(CommandSender sender, String[] args) {
        if(sender.hasPermission("staffannounce.send")){
        String message = String.join(" ", args);
        for(ProxiedPlayer player : ProxyServer.getInstance().getPlayers()){
            if(player.hasPermission("staffannounce.receive")){
                player.sendMessage(new TextComponent(message));
                }
            }
        }
    }
}