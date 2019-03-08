package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.ReservedTicket;
import com.gmail.nesterovich.aleksandr.model.ReservedTicketDto;

public class ReservedTicketConvector {

    public static ReservedTicket convert(ReservedTicketDto reservedTicketDto){
        ReservedTicket reservedTicket = new ReservedTicket();
        reservedTicket.setId(reservedTicketDto.getId());
        reservedTicket.setCode(reservedTicketDto.getCode());
        reservedTicket.setCost(reservedTicketDto.getCost());

        return reservedTicket;
    }

    public static ReservedTicketDto convert(ReservedTicket reservedTicket){
        ReservedTicketDto reservedTicketDto = new ReservedTicketDto();
        reservedTicketDto.setId(reservedTicket.getId());
        reservedTicketDto.setCode(reservedTicket.getCode());
        reservedTicketDto.setCost(reservedTicket.getCost());

        return reservedTicketDto;
    }
}
