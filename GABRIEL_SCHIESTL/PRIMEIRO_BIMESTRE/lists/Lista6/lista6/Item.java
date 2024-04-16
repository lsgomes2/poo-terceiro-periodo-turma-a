package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Item {
    String id, name, type;
    float price;

    public Item(String name, String type, String id, float price) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.price = price;
    }

    void showDescription() {
        System.out.println("ID: " + id + ", " + name + ", "
                + type + ", " + price);
    }
}
