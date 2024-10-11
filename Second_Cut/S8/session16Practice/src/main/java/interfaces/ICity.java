package interfaces;

import models.City;

import java.util.List;

public interface ICity {
    public void saveCity(City city);

    public City searchById(String id);
    public City searchByName(String name);
    public City searchByStatus(boolean status);

    public void updateCity(City city);
    public void deleteCity(String id);

    public List<City> getCities();

}
