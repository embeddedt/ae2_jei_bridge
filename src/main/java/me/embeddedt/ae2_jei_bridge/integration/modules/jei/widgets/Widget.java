package me.embeddedt.ae2_jei_bridge.integration.modules.jei.widgets;

import java.util.List;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

public interface Widget {
    void draw(GuiGraphics guiGraphics);

    default boolean hitTest(double x, double y) {
        return false;
    }

    default List<Component> getTooltipLines() {
        return List.of();
    }
}
