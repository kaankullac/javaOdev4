package javaodev4.concretes;

import javaodev4.abstracts.CampaignService;
import javaodev4.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi: "+ campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi: "+ campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi: "+ campaign.getCampaignName());
		
	}

}
