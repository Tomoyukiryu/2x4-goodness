package net.ScarletWind.twobyfourgoodness.item;

import net.ScarletWind.twobyfourgoodness.TwoByFourGoodness;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItems {
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TwoByFourGoodness.MODID);

  public static final DeferredItem<Item> PLANK = ITEMS.register("twobyfour", () -> new Item(new Item.Properties()));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
