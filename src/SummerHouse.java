class SummerHouse extends House {
    private boolean hasSwimmingPool;

    public SummerHouse(String address, int numRooms, int squareFootage, boolean hasSwimmingPool) {
        super(address, numRooms, squareFootage);
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }
}