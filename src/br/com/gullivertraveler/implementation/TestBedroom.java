package br.com.gullivertraveler.implementation;
import br.com.gullivertraveler.Bedroom;
import br.com.gullivertraveler.Service;

public class TestBedroom {
	public static void main(String[] args) { 
		Bedroom bedroom = new Bedroom();
		Service service = new Service();
		
		service.setKindOfService("Lavanderia");
		service.setAmount(80);
		
		
		bedroom.setTypeOfRoom("Suíte");
		bedroom.setMaximumOccupation(2);
		bedroom.setFloor(12);
		
		System.out.println("Tipo de quarto: " + bedroom.getTypeOfRoom());
		System.out.println("Número de hóspedes: " + bedroom.getMaximumOccupation());
		System.out.println("Andar do quarto: " + bedroom.getFloor());
		System.out.println("Tipos de serviço oferecido: " + service.getKindOfService());
		System.out.println("Valores do serviço: " + service.getAmount());
		
		
	}
}
