package com.pajarito.ProductApi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int prod_id;
    private String prod_name;
    private String category;
    private double unit_price;

    public Product()
    {
    }

    public Product( String prod_name, String category, double unit_price )
    {
        this.setProd_name(prod_name);
        this.setCategory(category);
        this.setUnit_price(unit_price);
    }

    public int getProd_id() { return prod_id; }

    public void setProd_id(int prod_id) { this.prod_id = prod_id; }

    public String getProd_name() { return prod_name; }

    public void setProd_name(String prod_name) { this.prod_name = prod_name; }

    public void setCategory(String category) { this.category = category; }

    public String getCategory() { return category; }

    public double getUnit_price() { return unit_price; }

    public void setUnit_price(double unit_price) { this.unit_price = unit_price; }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.prod_id);
        hash = 79 * hash + Objects.hashCode(this.prod_name);
        hash = 79 * hash + + Objects.hashCode(this.category);
        hash = 79 * hash + + Objects.hashCode(this.unit_price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.prod_name, other.prod_name)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.unit_price, other.unit_price)) {
            return false;
        }
        if (!Objects.equals(this.prod_id, other.prod_id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prod_id=" + prod_id +
                ", prod_name='" + prod_name + '\'' +
                ", category='" + category + '\'' +
                ", unit_price=" + unit_price +
                '}';
    }
}
