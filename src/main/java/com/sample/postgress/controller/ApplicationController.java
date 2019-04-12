package com.sample.postgress.controller;

import com.sample.postgress.entity.Country;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.sample.postgress.service.CountryService;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ApplicationController {

    @Resource
    CountryService countryService;
//
//    @GetMapping(value = "/")
//    public List<Country> getCountries() {
//        return countryService.findAll();
//
//    }

    @GetMapping(value = "/{code}")
    public ResponseEntity getCountry(@PathVariable("code") String code) {
        System.out.println("Code:" + code);
        try {
            Country c = countryService.findCountry(code);
            return new ResponseEntity<>(c, HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Exception:::::::" + e.getMessage());
//            e.printStackTrace();
            return new ResponseEntity<>("INVALID_COUNTRY_CODE", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            System.out.println("Exception:::::::" + e.getMessage());
//            e.printStackTrace();
            return new ResponseEntity<>("INTERNAL_ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
