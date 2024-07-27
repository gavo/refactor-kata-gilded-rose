package edu.alenasoft.strategies;

import edu.alenasoft.Item;

public class DecreaseQualityStrategy implements Strategy {

   private int decrementedValue;

   public DecreaseQualityStrategy(int decrementedValue) {
      this.decrementedValue = decrementedValue;
   }

   @Override
   public void apply(Item item) {
      item.setQuality(item.getQuality() - (item.getSellIn() > 0 ? this.decrementedValue : (this.decrementedValue * 2)));
      if (item.getQuality() < Strategy.MIN_QUALITY)
         item.setQuality(Strategy.MIN_QUALITY);
   }

}
