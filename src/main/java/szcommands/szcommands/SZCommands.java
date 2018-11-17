package szcommands.szcommands;

import org.bukkit.plugin.java.JavaPlugin;
import szcommands.szcommands.commands.Feed;
import szcommands.szcommands.commands.Fly;
import szcommands.szcommands.commands.God;
import szcommands.szcommands.commands.Heal;

public final class SZCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();;
        getCommand("god").setExecutor(new God());
        getCommand("feed").setExecutor(new Feed());
        getCommand("heal").setExecutor(new Heal());
        getCommand("fly").setExecutor(new Fly());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
