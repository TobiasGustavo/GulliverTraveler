package br.com.gullivertraveler.implementation;
import br.com.gullivertraveler.Accommodation;

public class TestAccommodation {
	public static void main (String[] args) {
		
		Accommodation accommodation = new Accommodation();
		accommodation.setAddress("Av. Paulista 530");
		accommodation.setPhone("11999999999");
		accommodation.setEmail("hospedagem@hotel.com.br");
		
		System.out.println("Endereço: " + accommodation.getAddress());
		System.out.println("Número de contato: " + accommodation.getPhone());
		System.out.println("E-mail de contato: " + accommodation.getEmail());

	}
}
