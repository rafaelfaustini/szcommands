package szcommands.szcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import szcommands.szcommands.SZCommands;


public class Day implements CommandExecutor{


    Plugin plugin = SZCommands.getPlugin(SZCommands.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){

            Player player = (Player) sender;

            if(!player.hasPermission("szcommands.day")) {
                String texto = plugin.getConfig().getString("NoPermission");
                player.sendMessage(ChatColor.RED+texto);
                return false;
            }
            String texto = plugin.getConfig().getString("Day");
            player.getLocation().getWorld().setTime(0);
            player.sendMessage(ChatColor.GREEN+texto);
        }
        return true;
    }


}
