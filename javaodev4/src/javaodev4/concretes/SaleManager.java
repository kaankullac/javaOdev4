package javaodev4.concretes;

import javaodev4.abstracts.SaleService;
import javaodev4.entities.Campaign;
import javaodev4.entities.Gamer;
import javaodev4.entities.Games;

public class SaleManager implements SaleService{

	@Override
	public void sellGame(Gamer gamer, Campaign campaign, Games games) {
		System.out.println("Oyuncu "+gamer.getFirstName()+games.getGameName()+"adlý oyun alýnýyor");
		System.out.println("Uygulanan kampanya : "+ campaign.getCampaignName());
		System.out.println("Kampanya öncesi fiyat : " + games.getUnitPrice());
		System.out.println("Ýndirimli fiyat : "+ (games.getUnitPrice()-(games.getUnitPrice()*campaign.getDiscount())));
		System.out.println("Oyuncu "+ gamer.getFirstName()+games.getGameName()+"oyununu aldý.");
	}
	



}
