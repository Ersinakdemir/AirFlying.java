package day39overriding;

public class Corolla extends Toyota {
    String hiz ="Toyota araclar max 200 km hiz yapar";
    String yakit ="Corolla benzinli yada elektriklidir";
    String model="Corolla";

    public void yakitTuketimi(){
        System.out.println("Toyota Corolla arabalar cevreci motor kullanir");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
/*
Data türü ve Constractor farkli oldugunda Constrator calistigi
icin obje Contrator in oldugu class özelliklerini tasi
ancak Dataturu parent class secildigi icin
variable lara data türünün secildigi class ve onun Parent
 Claslarin dan deger alalnbilr

 Methodlar ise yine ydata türünün oldugu class a gideriz.  ancak direck methodu calistirmadan
 önce Method overriding edilmis mi diye kontrol edilmisti
 */
        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket);//Araba classindan
        System.out.println(arb1.hiz);//Corollan
        System.out.println(arb1.yakit);//Corollan
        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.sirketMerkezi);//Toyota
        System.out.println(arb1.model);//Corolla
        arb1.motor();//Corolla

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket);//Araba classindan
        System.out.println(arb2.hiz);//Toyota
        System.out.println(arb2.yakit);//Araba
        System.out.println(arb2.marka);//Toyota
        System.out.println(arb2.sirketMerkezi);//Toyota
       // System.out.println(arb2.model);//CTE
        arb2.motor();//Corolla
        arb2.garanti();//Toyota
        arb2.yakitTuketimi();//Corolla // Overrid edilmis
        //arb2vitesSayisi(); calismaz cünkü data türü olan Toyota ve onun parent
                             // Classlarinda bu method yok. Child Class olan
                              // Corollada var ama java Chil Class  lardas degil parentlarda arar



        Araba arb3 =new Corolla();
        System.out.println(arb3.hareket);//Araba classindan
        System.out.println(arb3.hiz);//Araba
        System.out.println(arb3.yakit);//Araba
        System.out.println(arb3.marka);//Araba
        // System.out.println(arb3.sirketMerkezi);//CTE
        // System.out.println(arb3.model);//CTE
        arb3.yakitTuketimi();//yakit tüketi mi de araba class inda olmasina ragmen. Corolla classinda
                              // ki calisir cünkü method Corolla classin da Overrid edilmis
        arb3.motor();//Corolla
        //arb3.garanti();  CTE //bulamaz cünkü Araba classinda yok


    }
}
