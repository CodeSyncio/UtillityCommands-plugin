package projects.utilitycommands.Commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import projects.utilitycommands.UtilityCommands;


public class SpawnBoat implements CommandExecutor {

    private final UtilityCommands main;

    public SpawnBoat(UtilityCommands main){
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String myName = main.getConfig().getString("user.name");

        if (sender instanceof Player){
            if (sender.hasPermission("Util.boat")){
                Player player = (Player) sender;
                player.getWorld().spawnEntity(player.getLocation(),EntityType.BOAT);
                sender.sendMessage(ChatColor.AQUA+"[Util-Commands] Boat has been spawned");
                return true;
            }
        else{
            sender.sendMessage(ChatColor.RED+"[Util-Commands] Sorry, u don't have permission to use this command");
            }
        }
    return true;
    }
}