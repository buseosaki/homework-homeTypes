import java.util.ArrayList;
import java.util.List;

class RealEstate {
    private List<House> houses;
    private List<Villa> villas;
    private List<SummerHouse> summerHouses;

    public RealEstate() {
        this.houses = new ArrayList<>();
        this.villas = new ArrayList<>();
        this.summerHouses = new ArrayList<>();
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void addVilla(Villa villa) {
        villas.add(villa);
    }

    public void addSummerHouse(SummerHouse summerHouse) {
        summerHouses.add(summerHouse);
    }

    public List<House> getHouseList() {
        return houses;
    }

    public List<Villa> getVillaList() {
        return villas;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouses;
    }
}
