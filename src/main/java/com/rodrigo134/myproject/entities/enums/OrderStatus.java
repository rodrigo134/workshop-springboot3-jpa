package com.rodrigo134.myproject.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	PACKING(3),
	SHIPPED(4),
	DELIVERED(5),
	CANCELED(6);
	
	private int code;  // atributo para guardar o número
	
	private OrderStatus(int code) {       // construtor privado que recebe o código
		this.code = code;
		
	}

	public int getCode() {    //metodo para acessar o valor
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
