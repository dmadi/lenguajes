/*Lunes 20 de enero de 2014
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo1;

/**
 *
 * @author campitos
 */
public class Imagen {
  String nombre="Bicicleta";  
  String tipo="Montaña";  
  String tamano="Grande";
  public static void main(String args[]){
      Imagen i;
      i = new Imagen();
      System.out.println(i.nombre);
      Imagen t;
      t = new Imagen();
      System.out.println(t.tipo);
      Imagen ta;
      ta = new Imagen();
      System.out.println(ta.tamano);
  }
}
