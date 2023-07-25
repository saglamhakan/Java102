package patikaStore;

class CepTelefonu extends Product {
    private String hafiza;
    private String ekranBoyutu;
    private String pilGucu;
    private String renk;
    private int ram;

    public CepTelefonu(int id, double unitPrice, double discount, int stock, String name, Brand brand,
                       String hafiza, String ekranBoyutu, String pilGucu, String renk) {
        super(id, unitPrice, discount, stock, name, brand);
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.renk = renk;
    }

    public String getHafiza() {
        return hafiza;
    }

    public String getEkranBoyutu() {
        return ekranBoyutu;
    }

    public String getPilGucu() {
        return pilGucu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public ProductType getProductType() {
        return ProductType.CEP_TELEFONU;
    }

    @Override
    public void showDetails() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2d | %-30s | %-10.1f TL | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s |%n",
                getId(), getName(), getUnitPrice(), getBrand().getName(), getHafiza(), getEkranBoyutu(), "-", getPilGucu(), getRam(), getRenk());
    }

    private Object getRam() {
        return null;
    }


}
