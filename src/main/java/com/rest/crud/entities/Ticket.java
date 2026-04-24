package com.rest.crud.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ticket")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id")
	private Integer tickid;
	@Column(name = "passanger_name",nullable = false)
	private String passangerName;
	@Column(name="source_station")
	private String sourceStation;
	@Column(name = "dest_station")
	private String destStation;
	@Column(name = "email")
	private String email;
}
