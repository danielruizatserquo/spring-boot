package es.serquo.springboot.demo.models;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name="products")
public class Product {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(length=30, nullable=false, unique=true)
    private String name;

    @Column(nullable=false)
    private Integer quantity;

    @Column(nullable=false)
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
