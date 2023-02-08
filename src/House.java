class House {
    private String address;
    private int numRooms;
    private int squareFootage;
    private int price;
    private int squareMeter;

    public House(String address, int numRooms, int squareFootage, int price) {
        this.address = address;
        this.numRooms = numRooms;
        this.squareFootage = squareFootage;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public int getPrice() {
        return price;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }
}