package com.rest.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.crud.entities.Ticket;
import com.rest.crud.repository.TicketBookingRepository;

@Service
public class TicketBookingService {
	@Autowired
	private TicketBookingRepository ticketBookingRepository;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingRepository.save(ticket);
	}
	public List<Ticket> getAllTickets(){
		return ticketBookingRepository.findAll();
	}
	public Ticket findTicketById(Integer ticketId) {
		return ticketBookingRepository.findById(ticketId).get();
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketDB = ticketBookingRepository.findById(ticketId).get();
		ticketDB.setEmail(newEmail);
		Ticket updateDB = ticketBookingRepository.save(ticketDB);
		return updateDB;
		
	}
	public void deleteTicket(Integer ticketId) {
		ticketBookingRepository.deleteById(ticketId);
	}
}