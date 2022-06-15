package perpustakaan;

import java.util.ArrayList;
/**
 *
 * @author Adrian
 */
public class Siswa implements User {
      private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    public Siswa(){
        this.namaSiswa.add("Wahab");
        this.alamat.add("Bandulan");
        this.telepon.add("085123467890");
        this.status.add(true);
        
        this.namaSiswa.add("Razaq");
        this.alamat.add("Bandungrejosari");
        this.telepon.add("086123457890");
        this.status.add(true);
        
        this.namaSiswa.add("Fatah");
        this.alamat.add("Bareng");
        this.telepon.add("087123456890");
        this.status.add(true);
        
        this.namaSiswa.add("Hakam");
        this.alamat.add("Blimbing");
        this.telepon.add("088123456790");
        this.status.add(true);
    }

    @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
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
        return this.namaSiswa.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public void setStatus(int id, boolean status){
        this.status.set(id, status);
    }
    public boolean getStataus(int id){
        return this.status.get(id);
    }
    public void tampilkanSiswa(){
        int n = this.namaSiswa.size();
        for(int i = 0;i<n;i++){
            System.out.println("--------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
        
    }

   
    }

