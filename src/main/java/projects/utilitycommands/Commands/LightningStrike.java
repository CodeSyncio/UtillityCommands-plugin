package projects.utilitycommands.Commands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class LightningStrike implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("Util.strike")) {

            if (args.length !=0){

                if (Bukkit.getServer().getPlayer(args[0]) !=null ){

                    Player target = Bukkit.getServer().getPlayer(args[0]);

                    if (target.getGameMode() != GameMode.CREATIVE && target.getGameMode() != GameMode.SPECTATOR){

                        for (int i =0;i<target.getHealth()+10;i++) {

                            target.getWorld().strikeLightning(target.getLocation());
                            target.damage(i);
                        }
                        sender.sendMessage(ChatColor.DARK_AQUA+"[Util-Commands] player "+target.getDisplayName()+" has been struck with lightning");
                    }
                    else{
                        sender.sendMessage(ChatColor.RED + "[Util-Commands] Sorry, cannot strike players in creative or spectator mode");
                    }
                }
                else{
                    sender.sendMessage(ChatColor.RED + "[Util-Commands] Sorry, that player could not be found");
                }

            }
            else {
                sender.sendMessage(ChatColor.RED+"[Util-Commands] Sorry, u need to specify a player for this command");
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"[Util-Commands] Sorry, u don't have permission to use this command");
        }
        return true;
    }
}

