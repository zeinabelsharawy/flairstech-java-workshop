/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.postgress.entity;

/**
 *
 * @author zeinab.adel
 */
public class Country {

    private String code;
    private String name;
    private String continent;
    private int population;
    private int life_expectancy;
    private String country_language;
    private CountryLanguage countryLanguage;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(int life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public String getCountry_language() {
        return country_language;
    }

    public void setCountry_language(String country_language) {
        this.country_language = country_language;
    }

    

}
