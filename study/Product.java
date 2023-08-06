public class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object object) {
        Product product = (Product) object;
        // id만 같으면 true
        return this.id == product.id;
    }
}
