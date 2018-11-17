package szcommands.szcommands;

import org.bukkit.plugin.java.JavaPlugin;
import szcommands.szcommands.commands.*;

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
        getCommand("day").setExecutor(new Day());
        getCommand("night").setExecutor(new Night());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
