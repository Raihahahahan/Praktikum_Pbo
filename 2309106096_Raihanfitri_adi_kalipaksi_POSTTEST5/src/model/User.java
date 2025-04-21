package model;



public abstract  class User {
    public static final int MAX_LOGIN_ATTEMPTS = 3;
    protected int id;
    protected String nama;
    protected String alamat;
    protected String no_telp;
    protected String password;

    public User() {
        
    }

    public abstract void displayRole();

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No. Telepon: " + no_telp);
        displayRole();
    }

    public final boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}