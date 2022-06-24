package projects.utilitycommands.eventz;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import projects.utilitycommands.UtilityCommands;

public class BlockBreak implements Listener {
        private final UtilityCommands main;
        public BlockBreak(UtilityCommands main){
            this.main = main;
        }
        @EventHandler
        public void OnBlockBreak(BlockBreakEvent event) {


            if (main.getConfig().getBoolean("BlockBreakAllowed") == false) {

                if (event.getPlayer().hasPermission("Util.setbreak.bypass")) {

                }
                else {
                    event.setCancelled(true);
                }
            }
        }
}
