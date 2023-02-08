import java.util.List;


public class RealEstateService {


    private RealEstate realEstate;

    public RealEstateService() {
        this.realEstate = realEstate;
    }

    public double getTotalApartmentPrice(List<House> houses) {
        double totalPrice = 0.0;
        for (House apartment : realEstate.getHouseList()) {
            totalPrice += apartment.getPrice();
        }
        return totalPrice;
    }

    public double getTotalVillaPrice(List<Villa> villas) {
        double totalPrice = 0.0;
        for (Villa villa : realEstate.getVillaList()) {
            totalPrice += villa.getPrice();
        }
        return totalPrice;
    }

    public double getTotalSummerHousePrice(List<SummerHouse> summerHouses) {
        double totalPrice = 0.0;
        for (SummerHouse summerHouse : realEstate.getSummerHouseList()) {
            totalPrice += summerHouse.getPrice();
        }
        return totalPrice;
    }

    public double getTotalHousePrice() {
        return getTotalApartmentPrice() + getTotalVillaPrice(villas) + getTotalSummerHousePrice(summerHouses);
    }

    public double getAverageApartmentSquareMeter() {
        double totalSquareMeter = 0.0;
        for (House house : realEstate.getHouseList()) {
            totalSquareMeter += house.getSquareMeter();
        }
        return totalSquareMeter / realEstate.getHouseList().size();
    }

    public double getAverageVillaSquareMeter() {
        double totalSquareMeter = 0.0;
        for (Villa villa : realEstate.getVillaList()) {
            totalSquareMeter += villa.getSquareMeter();
        }
        return totalSquareMeter / realEstate.getVillaList().size();
    }

    public double getAverageSummerHouseSquareMeter() {
        double totalSquareMeter = 0.0;
        for (SummerHouse summerHouse : realEstate.getSummerHouseList()) {
            totalSquareMeter += summerHouse.getSquareMeter();
        }
        return totalSquareMeter / realEstate.getSummerHouseList().size();
    }

    public double getAverageHouseSquareMeter() {
        double totalSquareMeter = 0.0;
        for (House house : realEstate.getHouseList()) {
            totalSquareMeter += house.getSquareMeter();
        }
        for (Villa villa : realEstate.getVillaList()) {
            totalSquareMeter += villa.getSquareMeter();
        }
        for (SummerHouse summerHouse : realEstate.getSummerHouseList()) {
            totalSquareMeter += summerHouse.getSquareMeter();
        }
        return totalSquareMeter / (realEstate.getHouseList().size() + realEstate.getVillaList().size() + realEstate.getSummerHouseList().size());
    }
}
