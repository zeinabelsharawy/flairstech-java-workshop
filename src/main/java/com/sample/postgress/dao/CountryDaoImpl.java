package com.sample.postgress.dao;

import com.sample.postgress.entity.Country;
import java.util.List;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.postgress.mapper.CountryRowMapper;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CountryDaoImpl implements CountryDao {

    public CountryDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<Country> findAll() {
        return template.query("select * from country", new CountryRowMapper());
    }

    @Override
    public Country findCountry(String code) {
        final String sql = "select c.code,c.name,c.continent,c.population,l.language from country c "
                + "left join country_language l on c.code=l.country_code "
                + "where code=:code";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", code);

        return template.queryForObject(sql, map, new CountryRowMapper());

    }

}
