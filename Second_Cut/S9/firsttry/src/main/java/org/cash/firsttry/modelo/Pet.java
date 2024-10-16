package org.cash.firsttry.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Pet extends Identifiable{
	
	@Required
	@Column(name = "Name", nullable = false, length = 20)
	private String name;
	
	@Required
	@Column(name = "Breed", nullable = false, length = 20)
	private String dogBreed;
	
	@Required
	@Column(name = "Description", nullable = false, length = 100)
	private String description;
	
	private LocalDate birthDate;

}
