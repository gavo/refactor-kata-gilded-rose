package edu.alenasoft.strategies;

import edu.alenasoft.Item;

public interface Strategy {

   public static final int MAX_QUALITY = 50;
   public static final int MIN_QUALITY = 0;

   void apply(Item item);

}