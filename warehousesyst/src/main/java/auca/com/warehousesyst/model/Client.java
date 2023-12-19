package auca.com.warehousesyst.model;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email")
    private String email;
    @Column(name = "product")
    private String product;
    @Column(name = "uprice")
    private double uprice;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "total")
    private double total;

    public Client() {
    }

    public Client(long id, String email, String product, double uprice, int quantity, double total) {
        this.id = id;
        this.email = email;
        this.product = product;
        this.uprice = uprice;
        this.quantity = quantity;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getUprice() {
        return uprice;
    }

    public void setUprice(double uprice) {
        this.uprice = uprice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
