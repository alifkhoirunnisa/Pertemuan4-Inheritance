/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceBangunDatar;

/**
 *
 * @author UsEr
 */
public class Main {
    public static void main(String[] args) {
        //object bangun datar
        BangunDatar bangundatar= new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
                
        Lingkaran lingkaran= new Lingkaran();
        lingkaran.r =22;
        
        PersegiPanjang persegipanjang = new PersegiPanjang();   
        persegipanjang.lebar = 4;
        persegipanjang.panjang = 8;
             
        Segitiga segitiga = new Segitiga();
        segitiga.alas=12;
        segitiga.tinggi=8;
        
        //menunjukkan inheritage
        bangundatar.luas();
        persegi.luas();
        bangundatar.keliling();
        persegi.keliling();
        
       bangundatar.luas();
       persegipanjang.luas();
       bangundatar.keliling();
       persegipanjang.keliling();
       
       bangundatar.luas();
       segitiga.luas();
       bangundatar.keliling();
       segitiga.keliling();
       
       bangundatar.luas();
       lingkaran.luas();
       bangundatar.keliling();
       lingkaran.keliling();
    }
}

