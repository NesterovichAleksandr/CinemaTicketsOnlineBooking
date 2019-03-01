package com.gmail.nesterovich.aleksandr.dao.impl;

import com.gmail.nesterovich.aleksandr.dao.ReservedTicketDao;
import com.gmail.nesterovich.aleksandr.model.ReservedTicket;
import org.springframework.stereotype.Repository;

@Repository
public class ReservedTicketDaoImpl extends BaseDaoImpl<ReservedTicket, String> implements ReservedTicketDao {

    ReservedTicketDaoImpl() {
        super(ReservedTicket.class);
    }
}
