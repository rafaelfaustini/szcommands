package szcommands.szcommands;

import org.bukkit.plugin.java.JavaPlugin;
import szcommands.szcommands.commands.God;

public final class SZCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("god").setExecutor(new God());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
