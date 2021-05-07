package javaodev4.concretes;

import javaodev4.abstracts.CustomerCheckService;
import javaodev4.abstracts.GamerService;
import javaodev4.entities.Gamer;

public class GamerManager implements GamerService{
	
	private CustomerCheckService ccs;
	

	public GamerManager(CustomerCheckService ccs) {
		super();
		this.ccs = ccs;
	}

	@Override
	public void signUpGamer(Gamer gamer) {
		if(ccs.checkIfRealPerson(gamer)) {
		System.out.println("Oyuncu kay�t oldu: "+ gamer.getFirstName());
		}
		else {
			System.out.println("Ge�ersiz ki�i");
		}
		
	}

	@Override
	public void infoUpdate(Gamer gamer) {
		System.out.println("Oyuncu bilgileri g�ncellendi:" + gamer.getFirstName());
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
		
	}

	

}
