package projects.utilitycommands.Commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SpawnBoat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
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