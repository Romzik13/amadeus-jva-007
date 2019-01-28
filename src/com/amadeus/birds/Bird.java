public class Bird {
    private String birdName;
    private Double birdPrice;
    private int quantity;

    public Bird(String birdName, Double birdPrice, int quantity) {
        this.birdName = birdName;
        this.birdPrice = birdPrice;
        this.quantity = quantity;
    }

    public String getBirdName() {
        return birdName;
    }

    public Double getBirdPrice() {
        return birdPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
