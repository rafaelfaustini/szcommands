package szcommands.szcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class God implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            String[] alias = {"invulnerable","invincible","god"};
            String[] frase = new String[2];
            if(Arrays.asList(alias).contains(label)){
                frase[0]="You are now "+label;
                frase[1]="You are no longer "+label;
            }else{
                frase[0]="Você está "+label;
                frase[1]="Você não está mais "+label;
            }

            Player player = (Player) sender;
            if(player.isInvulnerable()){
                player.sendMessage(ChatColor.GOLD +frase[1]+label);
                player.setInvulnerable(false);
            } else{
                player.sendMessage(ChatColor.GOLD +frase[0]+label);
                player.setInvulnerable(true);
            }
        }
        return true;
    }
}
