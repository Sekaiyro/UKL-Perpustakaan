package perpustakaan;

import java.util.ArrayList;
/**
 *
 * @author Adrian
 */
public class Buku {
     private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public int size(){
        return this.namaBuku.size();
    }
    
    public Buku(){
        this.namaBuku.add("Pengetahuan Islam");
        this.stok.add(100);
        this.harga.add(100000);
        
        this.namaBuku.add("Pendidikan Kewarganegaraan");
        this.stok.add(75);
        this.harga.add(75000);
        
        this.namaBuku.add("Pintar Matematika");
        this.stok.add(50);
        this.harga.add(50000);
        
        this.namaBuku.add("Belajar Bahasa Inggris");
        this.stok.add(25);
        this.harga.add(25000);
    }
    
    public String getNama(int id){
        return this.namaBuku.get(id);
    }
    public int getStok(int id){
        return this.stok.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public void setNama(String nama){
        this.namaBuku.add(nama);
    }
    public void setStok(int id, int stok){
        this.stok.set(id, stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public void tampilkanBuku(){
        int n = this.namaBuku.size();
        for(int i = 0;i<n;i++){
            System.out.println("----------------------");
            System.out.println("Judul = "+getNama(i));
            System.out.println("Stok = "+getStok(i));
            System.out.println("Harga = "+getHarga(i));
        }
    }
}
