package model;

public class Customer extends User {
    private static int lastId = 0;

    public Customer() {
        super();
        this.id = ++lastId;
    }

    // Getter khusus untuk customer
    public int getId_customer() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", no_telp='" + no_telp + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}