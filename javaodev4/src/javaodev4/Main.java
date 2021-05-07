package javaodev4;

import java.time.LocalDate;

import javaodev4.abstracts.GamerService;
import javaodev4.adapters.MernisServiceAdapter;
import javaodev4.concretes.GamerManager;
import javaodev4.concretes.SaleManager;
import javaodev4.entities.Campaign;
import javaodev4.entities.Gamer;
import javaodev4.entities.Games;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1, "Kaan", "Küllaç", LocalDate.of(1998, 2, 5), "123456789");
		
		GamerService gamerService = new GamerManager(new MernisServiceAdapter());
		gamerService.signUpGamer(gamer1);
		
		
		
		Games game1 = new Games(1, "Witcher", 120);
		Games game2 = new Games(2, " Gta 5 ", 100);
		
		Campaign campaign1 = new Campaign(1, "Yaz Kampanyasý", 0.4);
		
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sellGame(gamer1, campaign1, game2);
		
		
		
		

	}

}
