package javaodev4.concretes;

import javaodev4.abstracts.GamesService;
import javaodev4.entities.Games;

public class GamesManager implements GamesService {

	@Override
	public void addGame(Games games) {
		System.out.println("Oyun eklendi : " + games.getGameName());
		
	}

	@Override
	public void deleteGame(Games games) {
		System.out.println("Oyun silindi : " + games.getGameName());
		
	}

}
