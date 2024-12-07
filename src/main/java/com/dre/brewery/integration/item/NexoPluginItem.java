package com.dre.brewery.integration.item;

import com.dre.brewery.integration.Hook;
import com.dre.brewery.recipe.PluginItem;
import com.nexomc.nexo.api.NexoItems;
import org.bukkit.inventory.ItemStack;

public class OraxenPluginItem extends PluginItem {
    @Override
    public boolean matches(ItemStack itemStack) {
        if (!Hook.NEXO.isEnabled()) {
            return false;
        }

        String itemId = NexoItems.idFromItem(itemStack);
        if (itemId == null) {
            return false;
        }
        return itemId.equals(this.getItemId());
    }
}