package szcommands.szcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import szcommands.szcommands.SZCommands;

public class Fly implements CommandExecutor  {



    Plugin plugin = SZCommands.getPlugin(SZCommands.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){


            Player player = (Player) sender;
            if(player.getAllowFlight()){
                String texto = plugin.getConfig().getStringList("Fly").get(1);
                player.sendMessage(ChatColor.GOLD +texto);
                player.setAllowFlight(false);
            } else{
                String texto = plugin.getConfig().getStringList("Fly").get(0);
                player.sendMessage(ChatColor.GOLD +texto);
                player.setAllowFlight(true);

            }
        }
        return true;
    }





}
