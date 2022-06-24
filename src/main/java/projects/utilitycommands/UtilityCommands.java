package projects.utilitycommands;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import projects.utilitycommands.Commands.LightningStrike;
import projects.utilitycommands.Commands.NoBreak;
import projects.utilitycommands.Commands.SpawnBoat;
import projects.utilitycommands.Commands.TpHere;
import projects.utilitycommands.eventz.BlockBreak;

public final class UtilityCommands extends JavaPlugin {

    @Override
    public void onEnable() {

        this.saveDefaultConfig();



        this.getConfig().set("BlockBreakAllowed", true);


        getCommand("strike").setExecutor(new LightningStrike());
        getCommand("boat").setExecutor(new SpawnBoat(this));
        getCommand("tphere").setExecutor(new TpHere());
        getCommand("setbreak").setExecutor(new NoBreak(this));

        getServer().getPluginManager().registerEvents( new BlockBreak(this),this);

        this.getConfig().set("BlockBreakAllowed", true);
        this.saveConfig();
    }
    @Override
    public void onDisable() {

    }
}
