package edu.alenasoft.strategies;

import edu.alenasoft.Item;

public class BackstageQualityStrategy implements Strategy {

   @Override
   public void apply(Item item) {
      if (item.getSellIn() > 10) {
         (new IncreaseQualityStrategy(1)).apply(item);
      } else if (item.getSellIn() > 5) {
         (new IncreaseQualityStrategy(2)).apply(item);
      } else if (item.getSellIn() > 0) {
         (new IncreaseQualityStrategy(3)).apply(item);
      } else {
         item.setQuality(0);
      }
   }

}
