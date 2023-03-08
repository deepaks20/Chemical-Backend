package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="chemicaltable")

public class chemicalsModel {

		@Id
		
	        private int chemicalid;
		private String chemicalname;
		private String  chemicalprice;
		private int  quantity;
		private int rating;
			
	    
			
	public int getChemicalid() {
			return chemicalid;
		}
		public void setChemicalid(int chemicalid) {
			this.chemicalid = chemicalid;
		}
		public String getChemicalname() {
			return chemicalname;
		}
		public void setChemicalname(String chemicalname) {
			this.chemicalname = chemicalname;
		}
		public String getChemicalprice() {
			return chemicalprice;
		}
		public void setChemicalprice(String chemicalprice) {
			this.chemicalprice = chemicalprice;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
	public chemicalsModel(int chemicalid, String chemicalname, String chemicalprice, int quantity, int rating) {
			super();
			this.chemicalid = chemicalid;
			this.chemicalname = chemicalname;
			this.chemicalprice = chemicalprice;
			this.quantity = quantity;
			this.rating = rating;
		}
	public chemicalsModel() {
			
		}
	public String toString() {
		return "chemicalid="+chemicalid+"chemicalname="+chemicalname+"chemicalprice="+chemicalprice+"quantity="+quantity+"rating="+rating;
	}
			}
	
