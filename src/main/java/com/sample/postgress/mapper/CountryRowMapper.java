package com.sample.postgress.mapper;

import com.sample.postgress.entity.Country;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class CountryRowMapper implements RowMapper<Country> {

    @Override
    public Country mapRow(ResultSet rs, int arg1) throws SQLException {
        Country country = new Country();
//        CountryLanguage language= new CountryLanguage();
        country.setCode(rs.getString("code"));
        country.setName(rs.getString("name"));
        country.setContinent(rs.getString("continent"));
        country.setPopulation(rs.getInt("population"));        
        country.setCountry_language(rs.getString("language"));

        return country;
    }

}
