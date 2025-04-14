package model;

public class Catatan_pengiriman {
    int id_pengiriman;
    int id_barang;
    int id_driver;
    String status_pengiriman;
    String tanggal_pengiriman;
    double harga;

    
    public int getId_pengiriman() {
        return id_pengiriman;
    }

    public void setId_pengiriman(int id_pengiriman) {
        this.id_pengiriman = id_pengiriman;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getId_driver() {
        return id_driver;
    }

    public void setId_driver(int id_driver) {
        this.id_driver = id_driver;
    }

    public String getStatus_pengiriman() {
        return status_pengiriman;
    }

    public void setStatus_pengiriman(String status_pengiriman) {
        this.status_pengiriman = status_pengiriman;
    }

    public String getTanggal_pengiriman() {
        return tanggal_pengiriman;
    }

    public void setTanggal_pengiriman(String tanggal_pengiriman) {
        this.tanggal_pengiriman = tanggal_pengiriman;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}