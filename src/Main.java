import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        RealEstateService realEstateService = new RealEstateService();

        List<House> houses = realEstateService.getHouseList();
        List<Villa> villas = realEstateService.getVillaList();
        List<SummerHouse> summerHouses = realEstateService.getSummerHouseList();

        System.out.println("Total price of houses: " + realEstateService.getTotalApartmentPrice(houses));
        System.out.println("Total price of villas: " + realEstateService.getTotalVillaPrice(villas));
        System.out.println("Total price of summer houses: " + realEstateService.getTotalSummerHousePrice(summerHouses));
        System.out.println("Total price of all real estates: " + realEstateService.getTotalPriceOfAllRealEstates(houses, villas, summerHouses));

        System.out.println("Average area of houses: " + realEstateService.getAverageAreaOfHouses(houses));
        System.out.println("Average area of villas: " + realEstateService.getAverageAreaOfVillas(villas));
        System.out.println("Average area of summer houses: " + realEstateService.getAverageAreaOfSummerHouses(summerHouses));
        System.out.println("Average area of all real estates: " + realEstateService.getAverageAreaOfAllRealEstates(houses, villas, summerHouses));

        System.out.println("Houses filtered by room count and living room count: " + realEstateService.filterHousesByRoomCountAndLivingRoomCount(houses, 3, 2));
    }

