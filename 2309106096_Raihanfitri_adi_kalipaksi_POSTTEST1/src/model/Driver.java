package model;

public class Driver {
    static int id_driver = 0;

    String nama;
    String no_telp;
    String password;
    String alamat;
    String plat_kendaraan;
    String nama_kendaraan;
    boolean status;

    public Driver() {
        id_driver++;
        this.id_driver = id_driver; 
        this.status = false; 
    }

    public int getId_driver() {
        return id_driver;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPlat_kendaraan() {
        return plat_kendaraan;
    }

    public void setPlat_kendaraan(String plat_kendaraan) {
        this.plat_kendaraan = plat_kendaraan;
    }

    public String getNama_kendaraan() {
        return nama_kendaraan;
    }

    public void setNama_kendaraan(String nama_kendaraan) {
        this.nama_kendaraan = nama_kendaraan;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id_driver=" + id_driver +
                ", nama='" + nama + '\'' +
                ", no_telp='" + no_telp + '\'' +
                ", password='" + password + '\'' +
                ", alamat='" + alamat + '\'' +
                ", plat_kendaraan='" + plat_kendaraan + '\'' +
                ", nama_kendaraan='" + nama_kendaraan + '\'' +
                ", status=" + status +
                '}';
    }
}