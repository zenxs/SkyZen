package zenxs.skyzen.config;

import zenxs.skyzen.SkyZen;
import zenxs.skyzen.hud.TestHud;
import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Dropdown;
import cc.polyfrost.oneconfig.config.annotations.HUD;
import cc.polyfrost.oneconfig.config.annotations.Slider;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.config.data.OptionSize;

/**
 * The main Config entrypoint that extends the Config type and inits the config options.
 * See <a href="https://docs.polyfrost.cc/oneconfig/config/adding-options">this link</a> for more config Options
 */
public class SkyZenConfig extends Config {

    @Switch(
            name = "Custom FOV",
            category = "Misc",
            subcategory = "Fov"
    )
    public static boolean customFovToggle = false;

    @Slider(
            name = "Slider",
            min = 30f, max = 200f, // Minimum and maximum values for the slider.
            step = 1,// The amount of steps that the slider should have.
            category = "Misc", // optional
            subcategory = "Fov"
    )
    public static float customFovSlider = 90f; // The default value for the float Slider.

    @Switch(
            name = "Gemstone Coin Tracker",
            category = "Mining",
            subcategory = "Gemstone"
    )
    public static boolean gemstoneCoinTracker = false;

    public SkyZenConfig() {
        super(new Mod(SkyZen.NAME, ModType.SKYBLOCK), SkyZen.MODID + ".json");
        initialize();
    }
}