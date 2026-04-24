package com.rest.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.crud.entities.Ticket;
@Repository
public interface TicketBookingRepository extends JpaRepository<Ticket, Integer> {

}
