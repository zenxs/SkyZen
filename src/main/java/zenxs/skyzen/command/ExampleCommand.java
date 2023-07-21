package zenxs.skyzen.command;

import zenxs.skyzen.SkyZen;
import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;

/**
 * An example command implementing the Command api of OneConfig.
 * Registered in ExampleMod.java with `CommandManager.INSTANCE.registerCommand(new ExampleCommand());`
 *
 * @see Command
 * @see Main
 * @see SkyZen
 */

@Command(value = SkyZen.MODID, description = "Access the " + SkyZen.NAME + " GUI.")
public class ExampleCommand {
    @Main
    private void handle() {
        SkyZen.INSTANCE.config.openGui();
    }
}