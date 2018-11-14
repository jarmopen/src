/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jarmo
 */

package henkilotiedot;

public class Henkilo {

   private String nimi;
   private int ika;

   public Henkilo(String nimi, int ika) {
      this.nimi = nimi;
      this.ika = ika;
   }

   public int haeIka() {      return this.ika;   }
   public String haeNimi() {      return this.nimi;   }}
