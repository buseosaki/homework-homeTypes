class Villa extends House {
    private int numBathrooms;
    private int numGarages;

    public Villa(String address, int numRooms, int squareFootage, int numBathrooms, int numGarages) {
        super(address, numRooms, squareFootage);
        this.numBathrooms = numBathrooms;
        this.numGarages = numGarages;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public int getNumGarages() {
        return numGarages;
    }
}