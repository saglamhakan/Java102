package patikaStore;

class Notebook extends Product {
    private int ram;
    private String depolama;
    private String ekranBoyutu;

    public Notebook(int id, double unitPrice, double discount, int stock, String name, Brand brand,
                    int ram, String depolama, String ekranBoyutu) {
        super(id, unitPrice, discount, stock, name, brand);
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getRam() {
        return ram;
    }

    public String getDepolama() {
        return depolama;
    }

    public String getEkranBoyutu() {
        return ekranBoyutu;
    }

    @Override
    public ProductType getProductType() {
        return ProductType.NOTEBOOK;
    }

    @Override
    public void showDetails() {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2d | %-30s | %-10.1f TL | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s |%n",
                getId(), getName(), getUnitPrice(), getBrand().getName(), getDepolama(), getEkranBoyutu(), getRam(), "-", "-", "-");
    }
}
