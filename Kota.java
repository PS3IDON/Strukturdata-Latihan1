package kota;

public class Kota<E> {
    private E element;
    
    public Kota(E Kota){
        element = Kota;
    }
    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
       Kota<Integer> jumlahkota = new Kota<Integer>(9);
       Kota<String> namaKota = new Kota <String>("Malang");
       System.out.println("Jumlah Kota di Jawa Timur :" + jumlahkota.getElement() + "kota" );
       System.out.println("salah satu kota di jawa timur : kota" + namaKota.getElement());
    }
    
}
