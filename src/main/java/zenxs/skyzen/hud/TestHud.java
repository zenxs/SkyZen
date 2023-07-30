package zenxs.skyzen.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import zenxs.skyzen.config.SkyZenConfig;

/**
 * An example OneConfig HUD that is started in the config and displays text.
 *
 * @see SkyZenConfig#hud
 */
public class TestHud extends SingleTextHud {
    public TestHud() {
        super("Test", true);
    }

    @Override
    public String getText(boolean example) {
        return "I'm an example HUD";
    }
}