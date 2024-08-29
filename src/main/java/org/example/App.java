package org.example;

import Dao.CityRepository;
import Dao.CountryRepository;
import Dao.MeasuresRepostory;
import model.City;
import model.County;
import model.Measures;

import java.sql.SQLException;


public class App {
    public App() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
        MeasuresRepostory measuresRepostory = new MeasuresRepostory();
        Measures measures = new Measures();
        measures.setName("Nurdoolot");
        measures.setAge(45);
        measures.setOwnCity("Toktogul");
        measuresRepostory.saveCountry(measures);

    }
}