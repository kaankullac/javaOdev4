package javaodev4.concretes;

import javaodev4.abstracts.SaleService;
import javaodev4.entities.Campaign;
import javaodev4.entities.Gamer;
import javaodev4.entities.Games;

public class SaleManager implements SaleService{

	@Override
	public void sellGame(Gamer gamer, Campaign campaign, Games games) {
		System.out.println("Oyuncu "+gamer.getFirstName()+games.getGameName()+"adl� oyun al�n�yor");
		System.out.println("Uygulanan kampanya : "+ campaign.getCampaignName());
		System.out.println("Kampanya �ncesi fiyat : " + games.getUnitPrice());
		System.out.println("�ndirimli fiyat : "+ (games.getUnitPrice()-(games.getUnitPrice()*campaign.getDiscount())));
		System.out.println("Oyuncu "+ gamer.getFirstName()+games.getGameName()+"oyununu ald�.");
	}
	



}
