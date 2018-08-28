package vipList.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long aId;
	
	@Column(name="NOME")
	private String aNome;
	
	@Column(name="EMAIL")
	private String aEmail;
	
	@Column(name="TELEFONE")
	private String aTelefone;
	
	public Long getId() {
		return aId;
	}
	
	public void setId(Long pId) {
		this.aId = pId;
	}
	
	public String getNome() {
		return aNome;
	}
	
	public void setNome(String pNome) {
		this.aNome = pNome;
	}
	
	public String getEmail() {
		return aEmail;
	}
	
	public void setEmail(String pEmail) {
		this.aEmail = pEmail;
	}
	
	public String getTelefone() {
		return aTelefone;
	}
	
	public void setTelefone(String pTelefone) {
		this.aTelefone = pTelefone;
	}
	
}