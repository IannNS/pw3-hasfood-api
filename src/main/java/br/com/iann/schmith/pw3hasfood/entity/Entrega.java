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
public class Entrega {
	
	@Id
	@Column(name = "ID_ENTREGA")
	private long id;
	
	@Column(name = "TX_NOME_CLIENTE")
	private String nome_cliente;
	
	@Column(name = "TX_ENDERECO")
	private String endereco;
	
	@Column(name = "ID_PEDIDO")
	private int id_pedido;
}
