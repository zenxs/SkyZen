package zenxs.skyzen.modules.misc;

import cc.polyfrost.oneconfig.events.event.TickEvent;
import cc.polyfrost.oneconfig.libs.eventbus.Subscribe;
import net.minecraft.client.Minecraft;

import static zenxs.skyzen.config.SkyZenConfig.customFovSlider;
import static zenxs.skyzen.config.SkyZenConfig.customFovToggle;

public class CustomFov {

    @Subscribe
    public void onTick(TickEvent event) {
        if (!customFovToggle) return;
        Minecraft.getMinecraft().gameSettings.fovSetting = customFovSlider;
    }
}