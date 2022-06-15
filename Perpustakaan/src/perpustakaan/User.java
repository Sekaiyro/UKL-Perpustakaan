package perpustakaan;

/**
 *
 * @author Adrian
 */
//Konstruktor adalah nama method yang sama dengan nama classnya
//Interface adalah tempat menyimpan method yang akan digunakan di beberapa subclass dan tidak bisa digunakan di main class
public interface User {
  public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);    
}
