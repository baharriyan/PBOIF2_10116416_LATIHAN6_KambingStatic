/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riyan Bahar
 * Nama  : Riyan Bahar
 * Kelas : IF-2
 * Nim   : 10116416
 * 
 */
public class KambingStatic {
    public static final String NAMA_KAMBING ="MIDUN";
      public static void main(String[] args) {
          Mamalia.jumlahKambing = 485000;
          System.out.println(NAMA_KAMBING + " memilki jumlah kambing sebanyak " + Mamalia.jumlahKambing);
      }
}

