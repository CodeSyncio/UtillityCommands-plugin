package projects.utilitycommands.Commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import projects.utilitycommands.UtilityCommands;
public class NoBreak implements CommandExecutor {
    private final UtilityCommands main;
    public NoBreak(UtilityCommands main){
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length !=0){
            if (sender.hasPermission("Util.setbreak")){
                if (args[0].equalsIgnoreCase("on")){
                    main.getConfig().set("BlockBreakAllowed", true);
                    main.saveConfig();
                    sender.sendMessage(ChatColor.AQUA+"[Util-Commands] block breaking has been ENABLED");
                }
                if (args[0].equalsIgnoreCase("off")){
                    main.getConfig().set("BlockBreakAllowed", false);
                    main.saveConfig();
                    sender.sendMessage(ChatColor.AQUA+"[Util-Commands] block breaking has been DISABLED");
                }
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"[Util-Commands] improper command usage. please use" +
                "/setbreak off to disable block placement, and /setbreak on to enable block placement");
        }
        return false;
    }
}

