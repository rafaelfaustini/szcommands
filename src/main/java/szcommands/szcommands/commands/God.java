package szcommands.szcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.isInvulnerable()){
                player.sendMessage(ChatColor.GOLD +"You are no longer invulnerable");
                player.setInvulnerable(false);
            } else{
                player.sendMessage(ChatColor.GOLD +"You are now invulnerable");
                player.setInvulnerable(true);
            }
        }
        return false;
    }
}
