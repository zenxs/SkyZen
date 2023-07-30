package zenxs.skyzen;

import cc.polyfrost.oneconfig.events.EventManager;
import zenxs.skyzen.command.SkyZenCommand;
import zenxs.skyzen.config.SkyZenConfig;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import net.minecraftforge.fml.common.Mod;
import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * The entrypoint of the Example Mod that initializes it.
 *
 * @see Mod
 * @see InitializationEvent
 */
@Mod(modid = SkyZen.MODID, name = SkyZen.NAME, version = SkyZen.VERSION)
public class SkyZen {
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    @Mod.Instance(MODID)
    public static SkyZen INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static SkyZenConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new SkyZenConfig();
        CommandManager.INSTANCE.registerCommand(new SkyZenCommand());
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        EventManager.INSTANCE.register(new zenxs.skyzen.modules.misc.CustomFov());
    }
}
