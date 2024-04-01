package me.embeddedt.ae2_jei_bridge.integration.modules.jei.widgets;

import java.util.List;

import net.minecraft.network.chat.Component;

public abstract class AbstractWidget implements Widget {
    public List<Component> tooltipLines = List.of();

    protected final void setTooltipLines(List<Component> tooltipLines) {
        this.tooltipLines = tooltipLines;
    }

    @Override
    public List<Component> getTooltipLines() {
        return tooltipLines;
    }
}
