package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
 public class Endereco {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEndereco", nullable = false)
	private Long idEndereco;
	
	@Column(name = "CEP", nullable = false, length = 8)
	private String cep;
	
	@Column(name = "Rua", nullable = false, length = 50)
	private String rua;
	
	@Column(name = "numCasa", nullable = false, length = 10)
	private String numCasa;
	
	@Column(name = "Cidade", nullable = false, length = 50)
	private String cidade;
	
	@Column(name = "Estado", nullable = false, length = 50)
	private String estado;
	
	@Column(name = "Complemento", nullable = true, length = 50)
	private String complemento;
	
	@Column(name = "Bairro", nullable = false, length = 50)
	private String bairro;
	
	//Construtores
	public Endereco () {
		
	}
	
	public Endereco (Long idEndereco,String cep, String rua, String numCasa, String cidade, String estado, String complemento, String bairro) {
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.rua = rua;
		this.numCasa = numCasa;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
		this.bairro = bairro;
	}
	
	//Getters and Setters
	public Long getId_endereco () {
		return idEndereco;
	}
	
	public void setId_endereco (Long idEndereco) {
		this.idEndereco = idEndereco;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
