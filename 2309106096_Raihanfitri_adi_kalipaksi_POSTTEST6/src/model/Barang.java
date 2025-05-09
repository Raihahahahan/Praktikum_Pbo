package model;

public class Barang implements Displayable {
    private int id_barang;
    private String nama;
    private int id_customer;
    private String alamat_asal;
    private String alamat_tujuan;

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

    @Override
    public void displayBasicInfo() {
        System.out.println("ID Barang: " + id_barang);
        System.out.println("Nama Barang: " + nama);
    }

    @Override
    public void displayDetailedInfo() {
        displayBasicInfo();
        System.out.println("Alamat Asal: " + alamat_asal);
        System.out.println("Alamat Tujuan: " + alamat_tujuan);
        System.out.println("ID Customer: " + id_customer);
    }
}