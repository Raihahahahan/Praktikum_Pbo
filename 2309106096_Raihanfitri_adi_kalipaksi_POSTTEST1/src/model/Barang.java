package model;

public class Barang {
    int id_barang;
    String nama;
    int id_customer;
    String alamat_asal;
    String alamat_tujuan;

    // Getter dan Setter
    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getAlamat_asal() {
        return alamat_asal;
    }

    public void setAlamat_asal(String alamat_asal) {
        this.alamat_asal = alamat_asal;
    }

    public String getAlamat_tujuan() {
        return alamat_tujuan;
    }

    public void setAlamat_tujuan(String alamat_tujuan) {
        this.alamat_tujuan = alamat_tujuan;
    }
}