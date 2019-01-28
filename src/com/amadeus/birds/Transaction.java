public class Transaction {
    private String clientName;
    private String birdName;
    private int quantityBird;
    private Double price;

    public Transaction(String clientName, String birdName, int quantityBird, Double price) {
        this.clientName = clientName;
        this.birdName = birdName;
        this.quantityBird = quantityBird;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public int getQuantityBird() {
        return quantityBird;
    }

    public void setQuantityBird(int quantityBird) {
        this.quantityBird = quantityBird;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
