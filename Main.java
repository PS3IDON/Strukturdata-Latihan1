package Restaurant;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList<Konsumsi> ListKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();
        
        Makanan roti = new Makanan ();
        roti.setNamaHidangan("roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("susu sapi");
        breakfast.setkonsumsi(roti, susu);
        ListKonsumsi.add(breakfast);
        
        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setkonsumsi(nasi, air);
        
        System.out.println("menu konsumsi");
        for (Konsumsi<Makanan,Minuman>Konsumsi: ListKonsumsi){
            Makanan makanan = Konsumsi.getM();
            Minuman minuman = Konsumsi.getI();
            
            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
       
    }
    
}
