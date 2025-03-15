package model;

public class Customer {
    static int id_customer = 0; 
   
    String nama;
    String alamat;
    String no_telp;
    String password;
    
    public Customer() {
        id_customer++; 
        this.id_customer = id_customer;
    }

    public int getId_customer() {
        return id_customer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id_customer=" + id_customer +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", no_telp='" + no_telp + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}