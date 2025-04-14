package model;

public class Driver extends User {
    private String plat_kendaraan;
    private String nama_kendaraan;
    private boolean status;
    private static int lastId = 0;

    public Driver() {
        super();
        this.id = ++lastId;
        this.status = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Informasi Driver ===");
        super.displayInfo();
        System.out.println("Plat Kendaraan: " + plat_kendaraan);
        System.out.println("Nama Kendaraan: " + nama_kendaraan);
        System.out.println("Status: " + (status ? "Aktif" : "Menunggu Validasi"));
    }

    public int getId_driver() {
        return this.id;
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
                "id=" + id +
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