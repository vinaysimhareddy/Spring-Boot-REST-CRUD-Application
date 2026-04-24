package com.rest.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.crud.entities.Ticket;
import com.rest.crud.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value = "/create") //API: httt://localhost:8080/api/tickets/create
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	@GetMapping(value = "/ticket/alltickets")
	public List<Ticket> getAllTickets(){
		return ticketBookingService.getAllTickets();
	}
	@GetMapping(value = "/ticket/{ticketId}")
	public Ticket findTicketById(@PathVariable("ticketId")Integer ticketId ){
		return ticketBookingService.findTicketById(ticketId);
	}
	
	@PutMapping(value = "/ticket/{ticketId}/{newemail}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newemail") String newemail) {
		return ticketBookingService.updateTicket(ticketId, newemail);
	}
	
	@DeleteMapping(value = "/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer tickeId ) {
		ticketBookingService.deleteTicket(tickeId);
	}
}
