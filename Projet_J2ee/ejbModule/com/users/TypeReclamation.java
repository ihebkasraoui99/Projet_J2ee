package com.users;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class TypeReclamation {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String type;
@OneToMany
private List<Reclamation> reclamations = new ArrayList<Reclamation>();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public TypeReclamation(String type) {
	super();
	this.type = type;

}
public TypeReclamation() {
	super();
	// TODO Auto-generated constructor stub
}


}
