package com.sample.postgress.dao;

import com.sample.postgress.entity.Country;
import java.util.List;


public interface CountryDao {

    List<Country> findAll();

    Country findCountry(String code);  
}
