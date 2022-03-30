package br.com.iann.schmith.pw3hasfood.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "TBL_PEDIDO")

@Entity
public class Pedido {
	
	@Id
	@Column(name = "ID_PEDIDO")
	private long id;
	
	@Column(name = "DT_PEDIDO")
	private Date dt_pedido;
	
	@Column(name = "TX_STATUS")
	@Enumerated(EnumType.STRING) 
	private String tx_status;
	
	@Column(name = "ID_RESTAURANTE")
	private int id_restaurante;
	
}
