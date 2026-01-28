package model;

import jakarta.persistence.*;

@Entity
@Table(name="country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "Country")
	Capital  Capital;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Capital getCapital() {
		return Capital;
	}

	public void setCapital(Capital capital) {
		Capital = capital;
	}

	
	
	
}
