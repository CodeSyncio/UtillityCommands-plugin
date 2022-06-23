package projects.utilitycommands.Commands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpHere implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player  ){

            if (sender.hasPermission("Util.tphere")){

                if (args.length !=0){

                    if (Bukkit.getServer().getPlayer(args[0]) !=null ){

                        Player sendr = ((Player) sender).getPlayer();
                        Player target = Bukkit.getServer().getPlayer(args[0]);
                        target.teleport(sendr.getLocation());
                        sender.sendMessage(ChatColor.AQUA+"successfully tp'ed player "+args[0]);
                    }
                    else{
                        sender.sendMessage(ChatColor.RED+"The player "+args[0]+" could noy be found");
                    }
                }
                else{sender.sendMessage(ChatColor.RED+"[Util-Commands] Sorry, u need to specify a player for this command");
                }
            }
            else{
                sender.sendMessage(ChatColor.RED+"Sorry, you don't have acces to this command");
            }
        }
        else{
            System.out.println("[Util-Commands]This command can only be used by a player");
        }
        return true;
    }
}
