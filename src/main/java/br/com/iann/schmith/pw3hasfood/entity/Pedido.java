package br.com.iann.schmith.pw3hasfood.entity;

@Getter
@Setter
@Table(name = "TBL_PEDIDO")

@Entity
public class Pedido {
	
	@ID
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
