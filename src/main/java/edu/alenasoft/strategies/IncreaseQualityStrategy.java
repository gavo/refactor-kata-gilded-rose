package edu.alenasoft.strategies;

import edu.alenasoft.Item;

public class IncreaseQualityStrategy implements Strategy {

   private int incrementedValue;

   public IncreaseQualityStrategy(int incrementedValue) {
      this.incrementedValue = incrementedValue;
   }

   @Override
   public void apply(Item item) {
      item.setQuality(item.getQuality() + incrementedValue);

      if (item.getQuality() > Strategy.MAX_QUALITY)
         item.setQuality(Strategy.MAX_QUALITY);
   }

}
