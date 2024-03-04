package me.embeddedt.ae2_jei_bridge.integration.modules.jei;

import com.google.common.base.Strings;

import mezz.jei.api.runtime.IJeiRuntime;

import me.embeddedt.ae2_jei_bridge.integration.abstraction.IJEI;

public class JeiRuntimeAdapter implements IJEI {

    private final IJeiRuntime runtime;

    JeiRuntimeAdapter(IJeiRuntime jeiRuntime) {
        this.runtime = jeiRuntime;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public IJeiRuntime getRuntime() {
        return runtime;
    }

    @Override
    public String getSearchText() {
        return Strings.nullToEmpty(this.runtime.getIngredientFilter().getFilterText());
    }

    @Override
    public void setSearchText(String text) {
        this.runtime.getIngredientFilter().setFilterText(text);
    }

    @Override
    public boolean hasSearchFocus() {
        return this.runtime.getIngredientListOverlay().hasKeyboardFocus();
    }
}
