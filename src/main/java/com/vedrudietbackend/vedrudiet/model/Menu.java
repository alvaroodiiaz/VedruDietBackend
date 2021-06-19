package com.vedrudietbackend.vedrudiet.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private String DesayunoL;
	private String DesayunoM;
	private String DesayunoX;
	private String DesayunoJ;
	private String DesayunoV;
	private String DesayunoS;
	private String DesayunoD;
	private String MediaMananaL;
	private String MediaMananaM;
	private String MediaMananaX;
	private String MediaMananaJ;
	private String MediaMananaV;
	private String MediaMananaS;
	private String MediaMananaD;
	private String AlmuerzoL;
	private String AlmuerzoM;
	private String AlmuerzoX;
	private String AlmuerzoJ;
	private String AlmuerzoV;
	private String AlmuerzoS;
	private String AlmuerzoD;
	private String MeriendaL;
	private String MeriendaM;
	private String MeriendaX;
	private String MeriendaJ;
	private String MeriendaV;
	private String MeriendaS;
	private String MeriendaD;
	private String CenaL;
	private String CenaM;
	private String CenaX;
	private String CenaJ;
	private String CenaV;
	private String CenaS;
	private String CenaD;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="nombre", unique=false,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="DesayunoL", unique=false,nullable=false)
	public String getDesayunoL() {
		return DesayunoL;
	}
	public void setDesayunoL(String desayunoL) {
		DesayunoL = desayunoL;
	}
	
	@Column(name="DesayunoM", unique=false,nullable=false)
	public String getDesayunoM() {
		return DesayunoM;
	}
	public void setDesayunoM(String desayunoM) {
		DesayunoM = desayunoM;
	}
	
	@Column(name="DesayunoX", unique=false,nullable=false)
	public String getDesayunoX() {
		return DesayunoX;
	}
	public void setDesayunoX(String desayunoX) {
		DesayunoX = desayunoX;
	}
	
	@Column(name="DesayunoJ", unique=false,nullable=false)
	public String getDesayunoJ() {
		return DesayunoJ;
	}
	public void setDesayunoJ(String desayunoJ) {
		DesayunoJ = desayunoJ;
	}
	
	@Column(name="DesayunoV", unique=false,nullable=false)
	public String getDesayunoV() {
		return DesayunoV;
	}
	public void setDesayunoV(String desayunoV) {
		DesayunoV = desayunoV;
	}
	
	@Column(name="DesayunoS", unique=false,nullable=false)
	public String getDesayunoS() {
		return DesayunoS;
	}
	public void setDesayunoS(String desayunoS) {
		DesayunoS = desayunoS;
	}
	
	@Column(name="DesayunoD", unique=false,nullable=false)
	public String getDesayunoD() {
		return DesayunoD;
	}
	public void setDesayunoD(String desayunoD) {
		DesayunoD = desayunoD;
	}
	
	@Column(name="MediaL", unique=false,nullable=false)
	public String getMediaMananaL() {
		return MediaMananaL;
	}
	public void setMediaMananaL(String mediaMananaL) {
		MediaMananaL = mediaMananaL;
	}
	
	@Column(name="MediaM", unique=false,nullable=false)
	public String getMediaMananaM() {
		return MediaMananaM;
	}
	public void setMediaMananaM(String mediaMananaM) {
		MediaMananaM = mediaMananaM;
	}
	
	@Column(name="MediaX", unique=false,nullable=false)
	public String getMediaMananaX() {
		return MediaMananaX;
	}
	public void setMediaMananaX(String mediaMananaX) {
		MediaMananaX = mediaMananaX;
	}
	
	@Column(name="MediaJ", unique=false,nullable=false)
	public String getMediaMananaJ() {
		return MediaMananaJ;
	}
	public void setMediaMananaJ(String mediaMananaJ) {
		MediaMananaJ = mediaMananaJ;
	}
	
	@Column(name="MediaV", unique=false,nullable=false)
	public String getMediaMananaV() {
		return MediaMananaV;
	}
	public void setMediaMananaV(String mediaMananaV) {
		MediaMananaV = mediaMananaV;
	}
	
	@Column(name="MediaS", unique=false,nullable=false)
	public String getMediaMananaS() {
		return MediaMananaS;
	}
	public void setMediaMananaS(String mediaMananaS) {
		MediaMananaS = mediaMananaS;
	}
	
	@Column(name="MediaD", unique=false,nullable=false)
	public String getMediaMananaD() {
		return MediaMananaD;
	}
	public void setMediaMananaD(String mediaMananaD) {
		MediaMananaD = mediaMananaD;
	}
	
	@Column(name="AlmuerzoL", unique=false,nullable=false)
	public String getAlmuerzoL() {
		return AlmuerzoL;
	}
	public void setAlmuerzoL(String almuerzoL) {
		AlmuerzoL = almuerzoL;
	}
	
	@Column(name="AlmuerzoM", unique=false,nullable=false)
	public String getAlmuerzoM() {
		return AlmuerzoM;
	}
	public void setAlmuerzoM(String almuerzoM) {
		AlmuerzoM = almuerzoM;
	}
	
	@Column(name="AlmuerzoX", unique=false,nullable=false)
	public String getAlmuerzoX() {
		return AlmuerzoX;
	}
	public void setAlmuerzoX(String almuerzoX) {
		AlmuerzoX = almuerzoX;
	}
	
	@Column(name="AlmuerzoJ", unique=false,nullable=false)
	public String getAlmuerzoJ() {
		return AlmuerzoJ;
	}
	public void setAlmuerzoJ(String almuerzoJ) {
		AlmuerzoJ = almuerzoJ;
	}
	
	@Column(name="AlmuerzoV", unique=false,nullable=false)
	public String getAlmuerzoV() {
		return AlmuerzoV;
	}
	public void setAlmuerzoV(String almuerzoV) {
		AlmuerzoV = almuerzoV;
	}
	
	@Column(name="AlmuerzoS", unique=false,nullable=false)
	public String getAlmuerzoS() {
		return AlmuerzoS;
	}
	public void setAlmuerzoS(String almuerzoS) {
		AlmuerzoS = almuerzoS;
	}
	
	@Column(name="AlmuerzoD", unique=false,nullable=false)
	public String getAlmuerzoD() {
		return AlmuerzoD;
	}
	public void setAlmuerzoD(String almuerzoD) {
		AlmuerzoD = almuerzoD;
	}
	
	@Column(name="MeriendaL", unique=false,nullable=false)
	public String getMeriendaL() {
		return MeriendaL;
	}
	public void setMeriendaL(String meriendaL) {
		MeriendaL = meriendaL;
	}
	
	@Column(name="MeriendaM", unique=false,nullable=false)
	public String getMeriendaM() {
		return MeriendaM;
	}
	public void setMeriendaM(String meriendaM) {
		MeriendaM = meriendaM;
	}
	
	@Column(name="MeriendaX", unique=false,nullable=false)
	public String getMeriendaX() {
		return MeriendaX;
	}
	public void setMeriendaX(String meriendaX) {
		MeriendaX = meriendaX;
	}
	
	@Column(name="MeriendaJ", unique=false,nullable=false)
	public String getMeriendaJ() {
		return MeriendaJ;
	}
	public void setMeriendaJ(String meriendaJ) {
		MeriendaJ = meriendaJ;
	}
	
	@Column(name="MeriendaV", unique=false,nullable=false)
	public String getMeriendaV() {
		return MeriendaV;
	}
	public void setMeriendaV(String meriendaV) {
		MeriendaV = meriendaV;
	}
	
	@Column(name="MeriendaS", unique=false,nullable=false)
	public String getMeriendaS() {
		return MeriendaS;
	}
	public void setMeriendaS(String meriendaS) {
		MeriendaS = meriendaS;
	}
	
	@Column(name="MeriendaD", unique=false,nullable=false)
	public String getMeriendaD() {
		return MeriendaD;
	}
	public void setMeriendaD(String meriendaD) {
		MeriendaD = meriendaD;
	}
	
	@Column(name="CenaL", unique=false,nullable=false)
	public String getCenaL() {
		return CenaL;
	}
	public void setCenaL(String cenaL) {
		CenaL = cenaL;
	}
	
	@Column(name="CenaM", unique=false,nullable=false)
	public String getCenaM() {
		return CenaM;
	}
	public void setCenaM(String cenaM) {
		CenaM = cenaM;
	}
	
	@Column(name="CenaX", unique=false,nullable=false)
	public String getCenaX() {
		return CenaX;
	}
	public void setCenaX(String cenaX) {
		CenaX = cenaX;
	}
	
	@Column(name="CenaJ", unique=false,nullable=false)
	public String getCenaJ() {
		return CenaJ;
	}
	public void setCenaJ(String cenaJ) {
		CenaJ = cenaJ;
	}
	
	@Column(name="CenaV", unique=false,nullable=false)
	public String getCenaV() {
		return CenaV;
	}
	public void setCenaV(String cenaV) {
		CenaV = cenaV;
	}
	
	@Column(name="CenaS", unique=false,nullable=false)
	public String getCenaS() {
		return CenaS;
	}
	public void setCenaS(String cenaS) {
		CenaS = cenaS;
	}
	
	@Column(name="CenaD", unique=false,nullable=false)
	public String getCenaD() {
		return CenaD;
	}
	public void setCenaD(String cenaD) {
		CenaD = cenaD;
	}
}
