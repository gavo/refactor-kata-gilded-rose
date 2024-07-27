package edu.alenasoft;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.alenasoft.strategies.BackstageQualityStrategy;
import edu.alenasoft.strategies.DecreaseQualityStrategy;
import edu.alenasoft.strategies.IncreaseQualityStrategy;
import edu.alenasoft.strategies.Strategy;

public class GildedRose {

  protected static List<Item> items = new ArrayList<>();
  private static Logger logger = Logger.getLogger("Main");

  public static void main(String[] args) {

    logger.log(Level.INFO, "OMGHAI!");

    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    updateQuality();

    String output = String.valueOf(items);
    logger.log(Level.INFO, output);
  }

  public static void updateQuality() {
    Strategy incrementStrategy = new IncreaseQualityStrategy(1);
    Strategy decrementStrategy = new DecreaseQualityStrategy(1);
    Strategy decrementBy2Strategy = new DecreaseQualityStrategy(2);
    Strategy backstageStrategy = new BackstageQualityStrategy();

    items.forEach(item -> {
      if (item.getName().toUpperCase().contains("AGED BRIE")) {
        incrementStrategy.apply(item);
      } else if (item.getName().toUpperCase().contains("CONJURED")) {
        decrementBy2Strategy.apply(item);
      } else if (item.getName().toUpperCase().contains("BACKSTAGE")) {
        backstageStrategy.apply(item);
      } else if (!item.getName().toUpperCase().contains("SULFURAS")) {
        decrementStrategy.apply(item);
      }
      item.setSellIn(item.getSellIn() - 1);
    });
  }
}
