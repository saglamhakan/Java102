package patikaStore;

abstract class Product {
    private int id;
    private double unitPrice;
    private double discount;
    private int stock;
    private String name;
    private Brand brand;

    public Product(int id, double unitPrice, double discount, int stock, String name, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public abstract ProductType getProductType();

    public abstract void showDetails();
}
