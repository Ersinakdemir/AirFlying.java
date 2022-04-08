package day39overriding;

public class Araba {
    protected String hareket ="Arabalar teker ile hareket eder";
    protected String hiz ="Arabalar motor gücüne göre hiz yaparlar";
    protected String yakit ="Arabalar farkli yakitlar kullanabilir";
    protected String marka ="Arabalar üretildigi markaya sahiptir";

    public void motor(){
        System.out.println("Arabalar farli markalarda motor kullanirlar");
    }
    public void yakitTuketimi(){
        System.out.println("arabalar motor gücüne göre yakit tüketirler");
    }

}
