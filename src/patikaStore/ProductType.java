package patikaStore;

public enum ProductType {
    NOTEBOOK("Notebook"),
    CEP_TELEFONU("Cep Telefonu");

    private String name;

    ProductType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
