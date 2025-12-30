package exercicios.trabalhandoComArquivos.exercicios.entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String product;
    private Double price;
    private Integer quantity;

    List<Product> list = new ArrayList<>();

    public Product() {
    }

    public Product(String product, Double price, Integer quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public void addList (Product product) {
        list.add(product);
    }

    public Double totalValue() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
