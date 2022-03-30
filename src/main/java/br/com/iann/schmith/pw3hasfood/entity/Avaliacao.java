package br.com.iann.schmith.pw3hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "PW3_HAS_FOOD")

@Entity
public class Avaliacao {
	
	@Id
	@Column(name = "ID_AVALIACAO")
	private long id;
	
	@Column(name = "TX_COMENTARIO")
	private String comentario;
	
	@Column(name = "NR_NOTA")
	private String nota;
	
	@Column(name = "ID_PEDIDO")
	private int id_pedido;
}
