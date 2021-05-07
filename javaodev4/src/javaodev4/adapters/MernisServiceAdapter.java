package javaodev4.adapters;

import java.rmi.RemoteException;

import javaodev4.abstracts.CustomerCheckService;
import javaodev4.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = true;
		try{
			result=kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName(), gamer.getLastName(), gamer.getBirthDate().getYear());
			
		}
		catch(RemoteException e) {
			e.printStackTrace();
			
		}
		if(result) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
