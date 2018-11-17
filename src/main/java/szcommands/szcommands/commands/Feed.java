package szcommands.szcommands.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import szcommands.szcommands.SZCommands;


public class Feed implements CommandExecutor {

    Plugin plugin = SZCommands.getPlugin(SZCommands.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            String texto = plugin.getConfig().getString("Feed");
            Player player = (Player) sender;
            player.setFoodLevel(20);
            player.sendMessage(ChatColor.GREEN+texto);
        }
        return true;
    }

}

