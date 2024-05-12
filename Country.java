package map;

import java.util.ArrayList;
import java.util.List;

public class Country {
    public String name;
    List<City> cities = new ArrayList<>();

    public Country(String name) {
        this.name = name;
    }

    public void add_city(City c) {
        cities.add(c);
    }

    public void show() {
        System.out.println("Country name: " + name);
        for (City city : cities) {
            System.out.print(city.name + " , ");
        }
        System.out.println();
    }

    public City get_city(String name) {
        for (City city : cities) {
            if (city.name.equals(name))
                return city;
        }
        return null;
    }
}
