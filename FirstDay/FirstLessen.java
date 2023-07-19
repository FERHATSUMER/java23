package FirstDay;
public class FirstLessen{
    public static void main(String[] args){
        System.out.println("Hello World");
    String name = "Ferhat";
    String ortaMetin="İlginizi Çekebilir";
    String altMetin = "Vade Süresi";

    System.out.println(ortaMetin  );
    System.out.println( altMetin);

    int vade= 36;

    double dolarDun= 17.10;
    double dolarBugun= 18.10;

    System.out.println(dolarDun);
    System.out.println(dolarBugun);

    if(dolarBugun<dolarDun){
        System.out.println("Dolar Düştü");
    }
    else if(dolarBugun>dolarDun){
        System.out.println("Dolar Yükseldi");
    }
    else{
        System.out.println("Dolar Aynı");
    }

    String[] krediler = {
        "Hızlı Kredi",
        "Mutlu Emekli Kredisi",
        "Konut Kredisi",
        "Çiftçi Kredisi",
        "Msb Kredisi",
        "Meb Kredisi",
        "Kültür Bakanlığı Kredisi"
    };
    for(int i=0; i<krediler.length; i++){
        System.out.println(krediler[i]);
    }
}


}