package sample;

public class Obikety {

    public  void obliczenie(double wzrost,double waga){
        double wynik = waga;
               wynik = wynik/(wzrost*wzrost);
               wynik = wynik*100;
                   int a = (int)wynik;
                      double wynik1 = a;

        System.out.println("Twoj wynik wynosi: "+wynik1/100);
        sprawdznie(a/100);
    }

    public void sprawdznie(double wynik){
        if(wynik<18.5)
            System.out.println("Niestety masz niedowage, czas zaczac cos jesc :((((");
        else if(25>wynik&&wynik>18.5)
            System.out.println("jestes okeyy normal weight :)))))");
        else if(wynik<30&&wynik>25)
            System.out.println("Niestety masz nadwage  :((((");
        else if(wynik>30)
            System.out.println("Niestety to juz chyba otylosc??? :((((");
    }

}
