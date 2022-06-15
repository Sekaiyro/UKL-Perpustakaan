package perpustakaan;

import java.util.ArrayList;
/**
 *
 * @author Adrian
 */
//Implements adalah diwariskan dari class interface
//Setter dan Getter berhubungan dengan Enkapsulasi karena membantu mengakses data
public class Petugas implements User {
    // Array list adalah sebuah variabel yang memungkinkan kita membuat sebuah objek untuk menampung apapun
    //Array list mampu menyimpan data dengan tipe yang berbeda
   private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    // This untuk merepresentasikan objek dari class itu sendiri
    //Super untuk merepresentasikan objek dari main class
    public Petugas(){
        this.namaKaryawan.add("Rahman");  //String[]nama = {"Rahman","Malik","Salam","Azis"};
        this.alamat.add("Arjosari");
        this.telepon.add("081234567890");
        
        this.namaKaryawan.add("Malik");
        this.alamat.add("Arjowinangun");
        this.telepon.add("082134567890");
        
        this.namaKaryawan.add("Salam");
        this.alamat.add("Bakalankrajan");
        this.telepon.add("083124567890");
        
        this.namaKaryawan.add("Azis");
        this.alamat.add("Balearjosari");
        this.telepon.add("084123567890");
    }
    //Overriding adalah method yang sama dari 1 package yang sama
    //Overloading adalah method yang sama tapi parameter berbeda
    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaKaryawan.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public void tampilKaryawan(){//Method ini berfungsi untuk menampilkan data di atas 
        int n = this.namaKaryawan.size();
        for(int i = 0;i<n;i++){
            System.out.println("----------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
    }

   
    }

