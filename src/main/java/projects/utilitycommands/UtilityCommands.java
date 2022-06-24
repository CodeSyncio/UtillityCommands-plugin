package projects.utilitycommands;

import org.bukkit.plugin.java.JavaPlugin;
import projects.utilitycommands.Commands.LightningStrike;
import projects.utilitycommands.Commands.NoBreak;
import projects.utilitycommands.Commands.SpawnBoat;
import projects.utilitycommands.Commands.TpHere;
import projects.utilitycommands.eventz.BlockBreak;

public final class UtilityCommands extends JavaPlugin {

    @Override
    public void onEnable() {



        getCommand("strike").setExecutor(new LightningStrike());
        getCommand("boat").setExecutor(new SpawnBoat(this));
        getCommand("tphere").setExecutor(new TpHere());
        getCommand("setbreak").setExecutor(new NoBreak(this));

        getServer().getPluginManager().registerEvents( new BlockBreak(this),this);


        this.saveDefaultConfig();
        this.getConfig().set("BlockBreakAllowed",this.getConfig().getBoolean("BlockBreakAllowed"));
        this.saveConfig();
    }
    @Override
    public void onDisable() {
        this.saveConfig();
    }
}
