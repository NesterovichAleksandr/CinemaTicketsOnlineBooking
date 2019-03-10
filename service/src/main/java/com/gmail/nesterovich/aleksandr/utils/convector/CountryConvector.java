package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.Country;
import com.gmail.nesterovich.aleksandr.model.CountryDto;

public class CountryConvector {

    public static Country convert(CountryDto countryDto){
        Country country = new Country();
        country.setId(countryDto.getId());
        country.setCountry(countryDto.getCountry());

        return country;
    }

    public static CountryDto convert(Country country){
        CountryDto countryDto = new CountryDto();
        countryDto.setId(country.getId());
        countryDto.setCountry(country.getCountry());

        return countryDto;
    }
}
