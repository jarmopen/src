/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapaketti;
import henkilotiedot.*;

/**
 *
 * @author jarmo
 */
public class JavaPaketti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Henkilo matti = new Henkilo("Jarmo",52);
       henkilotiedot.Henkilo maija = new henkilotiedot.Henkilo(("Terhi"), 51);

       System.out.println("Henkilön "+matti.haeNimi()+" ikä on "+matti.haeIka());
       System.out.println("Henkilön "+maija.haeNimi()+" ikä on "+maija.haeIka());
    }
    
}
