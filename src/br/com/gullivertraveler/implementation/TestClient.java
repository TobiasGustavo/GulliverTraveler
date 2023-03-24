package br.com.gullivertraveler.implementation;

import br.com.gullivertraveler.Accommodation;
import br.com.gullivertraveler.Bedroom;
import br.com.gullivertraveler.Client;
import br.com.gullivertraveler.Guest;
import br.com.gullivertraveler.Service;

public class TestClient {
		public static void main(String[] args) {
		        Client object = new Client();
		        object.setEmail("teste@teste.com");
		        object.setGender("FEMININO");
		        object.setCpf("123456789");


		        System.out.println(object.getCpf());
		        System.out.println(object.getName());
		        System.out.println(object.getGender());
		        System.out.println(object.getEmail());
		        System.out.println(object.getAddress());

		        Guest guest = new Guest();
		        guest.setDataRecord(null);
//		        guest.setTimeStay(null);

		        Accommodation accommodation = new Accommodation();
		        accommodation.setGuest(null);
		        accommodation.setEmail(null);

		        Bedroom bedroom = new Bedroom();
		        bedroom.setTypeOfRoom(null);
		        bedroom.setMaximumOccupation(0);

		        Service service = new Service();
		        service.setKindOfService(null);
		        service.setAmount(0);
		}

}
