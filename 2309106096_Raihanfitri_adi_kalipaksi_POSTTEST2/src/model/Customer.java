package model;

public class Customer {
    protected static int id_customer = 0;
    protected String nama;
    protected String alamat;
    protected String no_telp;
    protected String password;

    public Customer() {
        id_customer++;
        this.id_customer = id_customer;
    }

    // Getter dan Setter
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