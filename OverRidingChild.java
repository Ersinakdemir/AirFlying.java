package day39overriding;

public class OverRidingChild extends OverRidingParent{

    public  void method1(){
        System.out.println("Child class method1");// Child class ta parent Class daki// ayni isimde ki bir method olusturursak
    }

    public static void main(String[] args) {
        /*
        Bir obje olusturulurken Data türü ve Constructor ayni classtan secilmisse java
        direk o class a gider hem variable hem de method icin o class da varsa kullanilir.
         yoksa o class in parentlarina bakilir

         */
        OverRidingChild obj1 =new OverRidingChild();
        obj1.method1();//Child class method1
        obj1.method2();//Parernt Class method2

        OverRidingParent obj2 =new OverRidingChild();
        obj2.method2();//Parernt Class method2//
        obj2.method1();//Child class method1 //obj2 data türü ParentClass
                       // olmsasina ragmen Child Class daki method1 calisir sebebi Child
                       // class ta Parent clastaki Method1 Overrid edilmis olmasidir

        OverRidingParent obj3 =new OverRidingParent();
        obj3.method2();//Parernt Class method2
        obj3.method1();//Parernt Class method1 hem data türü hem
                       // Constractur Parenttan oldugu icin parentdaki method1 calisir
    }
}
