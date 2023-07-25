package patikaStore;

public class Main {

    public static void main(String[] args) {
        PatikaStore store = new PatikaStore();
        store.addProduct(new CepTelefonu(1, 3199.0, 0, 100, "SAMSUNG GALAXY A51", store.brands.get(7), "128 GB", "6.5", "4000", "Siyah"));
        store.addProduct(new Notebook(1, 7000.0, 0, 50, "HUAWEI Matebook 14", store.brands.get(4), 16, "512 SSD", "14 inç"));
        store.start();
    }
}
