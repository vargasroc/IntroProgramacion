package com.company;
/*Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.*/

public class Coche {
      int puertas;
      int maspuertas;


    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public int maspuertas(int puertas){
         return this.puertas + 1;
    }
}
