package com.sample.postgress.service;

import com.sample.postgress.dao.CountryDao;
import com.sample.postgress.entity.Country;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class CountryServiceImpl implements CountryService {

    @Resource
    CountryDao countryDao;

    @Override
    public List<Country> findAll() {
        return countryDao.findAll();
    }

    @Override
    public Country findCountry(String code) {
        return countryDao.findCountry(code);
    }

}
