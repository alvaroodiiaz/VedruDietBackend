package com.vedrudietbackend.vedrudiet.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="food")
public class Food  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String foodName;
	
	private String calorias;
	private String lipidos;
	private String hidratos;
	private String proteinas;
	private String fibra;
	private String sodio;
	private String agps;
	private String ags;
	private String ams;
	private String calcio;
	private String fosforo;
	private String potasio;
	private String hierro;
	private String fenilalanina;
	private String tirosina;
	private String fructosa;
    
	private Set<Recipe> recipes;
    
    @ManyToMany
    @JoinTable(
    		name="recipe_foods", 
    		joinColumns = @JoinColumn(name = "food_id"),
    		inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )
    @JsonIgnore
    public Set<Recipe> getRecipes() {
		return recipes;
	}
    
    public void setRecipes(Set<Recipe> recipes) {
		this.recipes = recipes; 
	}
    
    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer foodId) {
		this.id = foodId;
	}

	@Column(name="nombre", unique=false,nullable=false)
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	@Column(name="calorias", unique=false,nullable=false)
	public String getCalorias() {
		return calorias;
	}

	public void setCalorias(String calorias) {
		this.calorias = calorias;
	}

	@Column(name="lipidos", unique=false,nullable=true)
	public String getLipidos() {
		return lipidos;
	}

	public void setLipidos(String lipidos) {
		this.lipidos = lipidos;
	}

	@Column(name="hidratos", unique=false,nullable=true)
	public String getHidratos() {
		return hidratos;
	}

	public void setHidratos(String hidratos) {
		this.hidratos = hidratos;
	}

	@Column(name="proteinas", unique=false,nullable=true)
	public String getProteinas() {
		return proteinas;
	}

	public void setProteinas(String proteinas) {
		this.proteinas = proteinas;
	}
	
	@Column(name="fibra", unique=false,nullable=true)
	public String getFibra() {
		return fibra;
	}

	public void setFibra(String fibra) {
		this.fibra = fibra;
	}

	@Column(name="sodio", unique=false,nullable=false)
	public String getSodio() {
		return sodio;
	}

	public void setSodio(String sodio) {
		this.sodio = sodio;
	}

	@Column(name="agps", unique=false,nullable=true)
	public String getAgps() {
		return agps;
	}

	public void setAgps(String agps) {
		this.agps = agps;
	}

	@Column(name="ags", unique=false,nullable=true)
	public String getAgs() {
		return ags;
	}

	public void setAgs(String ags) {
		this.ags = ags;
	}

	@Column(name="ams", unique=false,nullable=true)
	public String getAms() {
		return ams;
	}

	public void setAms(String ams) {
		this.ams = ams;
	}

	@Column(name="calcio", unique=false,nullable=true)
	public String getCalcio() {
		return calcio;
	}

	public void setCalcio(String calcio) {
		this.calcio = calcio;
	}

	@Column(name="fosforo", unique=false,nullable=true)
	public String getFosforo() {
		return fosforo;
	}

	public void setFosforo(String fosforo) {
		this.fosforo = fosforo;
	}

	@Column(name="potasio", unique=false,nullable=true)
	public String getPotasio() {
		return potasio;
	}

	public void setPotasio(String potasio) {
		this.potasio = potasio;
	}

	@Column(name="hierro", unique=false,nullable=true)
	public String getHierro() {
		return hierro;
	}

	public void setHierro(String hierro) {
		this.hierro = hierro;
	}

	@Column(name="fenilalanina", unique=false,nullable=true)
	public String getFenilalanina() {
		return fenilalanina;
	}

	public void setFenilalanina(String fenilalanina) {
		this.fenilalanina = fenilalanina;
	}

	@Column(name="tirosina", unique=false,nullable=true)
	public String getTirosina() {
		return tirosina;
	}

	public void setTirosina(String tirosina) {
		this.tirosina = tirosina;
	}

	@Column(name="fructosa", unique=false,nullable=true)
	public String getFructosa() {
		return fructosa;
	}

	public void setFructosa(String fructosa) {
		this.fructosa = fructosa;
	}
	
}
