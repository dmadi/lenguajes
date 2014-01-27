/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo1;

/**
 *
 * @author campitos
 */
public class Tarjeta {
    String nombre="Corporativa";
    String material="Papel";
    String color="Roja";
    public static void main(String args[]){
      Tarjeta n;
      n = new Tarjeta();
      System.out.println(n.nombre);
      Tarjeta m;
      m = new Tarjeta();
      System.out.println(m.material);
      Tarjeta c;
      c = new Tarjeta();
      System.out.println(c.color);
    }
}
