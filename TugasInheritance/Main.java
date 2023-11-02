/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInheritance;

/**
 *
 * @author UsEr
 */
public class Main {
    public static void main (String []args){
        Sayur sayur = new Sayur();
        
        sayur.bewarna("Bayam");
        Bayam bayam = new Bayam();
        bayam.Warna();
    
        sayur.bewarna("Terong");
        Terong terong = new Terong();
        terong.Warna();
        
        sayur.bewarna("Tomat");
        Tomat tomat = new Tomat();
        tomat.warna();
        
        sayur.bewarna("Wortel");
        Wortel wortel = new Wortel();
        wortel.Warna();
    }
    
}
