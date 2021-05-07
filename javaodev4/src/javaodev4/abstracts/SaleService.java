package javaodev4.abstracts;

import javaodev4.entities.Campaign;
import javaodev4.entities.Gamer;
import javaodev4.entities.Games;

public interface SaleService {
	void sellGame(Gamer gamer,Campaign campaign,Games games);

}
