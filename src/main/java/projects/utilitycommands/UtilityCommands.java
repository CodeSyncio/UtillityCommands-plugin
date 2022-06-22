package projects.utilitycommands;
import org.bukkit.plugin.java.JavaPlugin;
import projects.utilitycommands.Commands.LightningStrike;
import projects.utilitycommands.Commands.SpawnBoat;
public final class UtilityCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("strike").setExecutor(new LightningStrike());
        getCommand("boat").setExecutor(new SpawnBoat());
    }
    @Override
    public void onDisable() {

    }
}
