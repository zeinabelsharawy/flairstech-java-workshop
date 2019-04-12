package com.sample.postgress.service;

import com.sample.postgress.entity.Country;
import java.util.List;

public interface CountryService {

    List<Country> findAll();

    Country findCountry(String code);

}
