package szcommands.szcommands.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import szcommands.szcommands.SZCommands;

public class Heal implements CommandExecutor{

    Plugin plugin = SZCommands.getPlugin(SZCommands.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            String texto = plugin.getConfig().getString("Heal");
            Player player = (Player) sender;
            player.setHealth(20);
            player.sendMessage(ChatColor.GREEN+texto);
        }
        return true;
    }

}
