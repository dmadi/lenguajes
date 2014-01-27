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
public class Usuario {
    String nombre="Damian";
    String apellidoP="Jimenez";
    String apellidoM="Ramirez";
    Integer edad=21;
    public static void main(String args[]){
      Usuario n;
      n = new Usuario();
      System.out.println(n.nombre);
      Usuario ap;
      ap = new Usuario();
      System.out.println(ap.apellidoP);
      Usuario am;
      am = new Usuario();
      System.out.println(am.apellidoM);
      Usuario e;
      e = new Usuario();
      System.out.println(e.edad);
    }
    
}
