package br.usjt.previsaoTempo.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Tempo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dia_da_semana", columnDefinition="INTEGER")//Join column e para mapear o nome da coluna no banco de dados
	private PrevisaoDiaSemana diaDaSemana;
	private double temperaturaMinima;
	private double temperaturaMaxima;
	private String umidadeRelativa;
	private String descricao;
	private String latitude;
	private String longitude;
	private String dataHora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public String getUmidadeRelativa() {
		return umidadeRelativa;
	}

	public void setUmidadeRelativa(String umidadeRelativa) {
		this.umidadeRelativa = umidadeRelativa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public PrevisaoDiaSemana getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(PrevisaoDiaSemana diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

}