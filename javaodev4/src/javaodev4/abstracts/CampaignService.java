package javaodev4.abstracts;

import javaodev4.entities.Campaign;

public interface CampaignService {
	void addCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);

}
