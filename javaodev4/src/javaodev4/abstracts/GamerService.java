package javaodev4.abstracts;

import javaodev4.entities.Gamer;

public interface GamerService {
	void signUpGamer(Gamer gamer);
	void infoUpdate(Gamer gamer);
	void deleteGamer(Gamer gamer);

}
