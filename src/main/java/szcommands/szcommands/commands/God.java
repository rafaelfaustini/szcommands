package szcommands.szcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import szcommands.szcommands.SZCommands;


public class God implements CommandExecutor {
    Plugin plugin = SZCommands.getPlugin(SZCommands.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){


            Player player = (Player) sender;
            if(!player.hasPermission("szcommands.god")) {
                String texto = plugin.getConfig().getString("NoPermission");
                player.sendMessage(ChatColor.RED+texto);
                return false;
            }

            if(player.isInvulnerable()){
                String texto = plugin.getConfig().getStringList("God").get(1);
                player.sendMessage(ChatColor.GOLD +texto);
                player.setInvulnerable(false);
            } else{
                String texto = plugin.getConfig().getStringList("God").get(0);
                player.sendMessage(ChatColor.GOLD +texto);
                player.setInvulnerable(true);
            }
        }
        return true;
    }
}
