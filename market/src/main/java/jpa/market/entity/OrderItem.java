package jpa.market.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class OrderItem {

	@Id
	@GeneratedValue
	@Column(name = "ORDER_ITEM_ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ITEM_ID")
	private Item item;
	
	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	private int orderPrice;
	private int count;
}
