package projects.utilitycommands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import projects.utilitycommands.Commands.LightningStrike;

public final class UtilityCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("strike").setExecutor(new LightningStrike());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
