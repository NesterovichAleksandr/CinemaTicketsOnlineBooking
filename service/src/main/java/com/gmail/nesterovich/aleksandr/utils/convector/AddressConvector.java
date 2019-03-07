package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.Address;
import com.gmail.nesterovich.aleksandr.model.AddressDto;

public class AddressConvector {

    public AddressConvector() {
    }

    public static Address convert(AddressDto addressDto){
        Address address = new Address();
        address.setId(addressDto.getId());
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setHome(addressDto.getHome());

        return address;
    }

    public static AddressDto convert(Address address){
        AddressDto addressDto = new AddressDto();
        addressDto.setId(address.getId());
        addressDto.setCity(address.getCity());
        addressDto.setStreet(address.getStreet());
        addressDto.setHome(address.getHome());

        return addressDto;
    }
}
