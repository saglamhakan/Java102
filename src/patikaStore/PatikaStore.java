package patikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {
    List<Brand> brands;
    private List<Product> products;

    public PatikaStore() {
        this.brands = new ArrayList<>();
        this.products = new ArrayList<>();
        initializeBrands();
    }

    private void initializeBrands() {
        brands.add(new Brand(1, "Apple"));
        brands.add(new Brand(2, "Asus"));
        brands.add(new Brand(3, "Casper"));
        brands.add(new Brand(4, "HP"));
        brands.add(new Brand(5, "Huawei"));
        brands.add(new Brand(6, "Lenovo"));
        brands.add(new Brand(7, "Monster"));
        brands.add(new Brand(8, "Samsung"));
        brands.add(new Brand(9, "Xiaomi"));
        Collections.sort(brands);
    }

    private void displayMenu() {
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");
    }

    private void listBrands() {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }

    private void listProducts(ProductType productType) {
        String header = productType == ProductType.NOTEBOOK ? "Notebook Listesi" : "Cep Telefonu Listesi";
        String tableHeader = productType == ProductType.NOTEBOOK ? "----------------------------------------------------------------------------------------------------"
                : "--------------------------------------------------------------------------------------------------------------------------------------";
        System.out.println(header);
        System.out.println(tableHeader);
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println(tableHeader);
        for (Product product : products) {
            if (product.getProductType() == productType) {
                product.showDetails();
            }
        }
    }

    void addProduct(Product product) {
        products.add(product);
        System.out.println("Ürün başarıyla eklendi!");
    }

    private void removeProduct(int productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == productId) {
                products.remove(i);
                System.out.println("Ürün başarıyla silindi!");
                return;
            }
        }
        System.out.println("Böyle bir ürün bulunamadı!");
    }

    private void filterProductsByBrand(String brandName) {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            if (product.getBrand().getName().equalsIgnoreCase(brandName)) {
                product.showDetails();
            }
        }
    }

    void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Tercihiniz : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listProducts(ProductType.NOTEBOOK);
                    break;
                case 2:
                    listProducts(ProductType.CEP_TELEFONU);
                    break;
                case 3:
                    listBrands();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz tercih! Lütfen tekrar deneyin.");
            }

        } while (choice != 0);
    }
}