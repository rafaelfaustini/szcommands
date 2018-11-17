package szcommands.szcommands.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import szcommands.szcommands.SZCommands;

public class Night implements CommandExecutor{

    Plugin plugin = SZCommands.getPlugin(SZCommands.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){

            Player player = (Player) sender;

            if(!player.hasPermission("szcommands.night")) {
                String texto = plugin.getConfig().getString("NoPermission");
                player.sendMessage(ChatColor.RED+texto);
                return false;
            }
            String texto = plugin.getConfig().getString("Night");
            player.getLocation().getWorld().setTime(18000);
            player.sendMessage(ChatColor.GREEN+texto);
        }
        return true;
    }

}
