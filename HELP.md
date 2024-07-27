## 1. Entendiendo el codigo base

El código base presenta las siguientes características

#### 1.1. Atributos del item

- **sellIn** indica la cantidad de dias que se tiene para vender el item
- **quality** indica el valor del item, nunca sera negativo ni mayor a 50
- cuando el **sellIn** ha llegado a 0, el **quality** se degrada el doble de rápido

#### 1.2. Comportamiento de los Items

- el item _"Aged Brie"_ incrementa su **quality** a medida que envejece
- el item _"Backstage passes"_ incrementa su **quality** a medida que envejece
  - (**x2** cuando el **sellIn <= 10**)
  - (**x3** cuando el **sellIn <= 5**)
  - (**quality = 0** cuando el **sellIn <= 0**)
- el item _"Sulfuras"_ nunca cambia su **quality** que siempre será **80**

## 2. Nueva Funcionalidad

Se ha pedido agregar los items **conjured**, cuya única característica es:

- degradan su **quality x2**
