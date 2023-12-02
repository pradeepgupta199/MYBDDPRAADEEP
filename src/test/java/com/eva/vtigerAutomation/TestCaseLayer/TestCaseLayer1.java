package com.eva.vtigerAutomation.TestCaseLayer;

import java.util.Map;

import org.testng.annotations.Test;
import com.eva.vtigerAutomation.HomePage.HomeLandingPage;
import com.eva.vtigerAutomation.Marketing.Leads.LeadsCreationPage;
import com.eva.vtigerAutomation.Marketing.Leads.LeadsDetailsPage;
import com.eva.vtigerAutomation.Marketing.Leads.LeadsEditionPage;
import com.eva.vtigerAutomation.Marketing.Leads.LeadsLandingPage;
import com.eva.vtigerAutomation.listener.retryFailedCases;

public class TestCaseLayer1 extends BaseTest {
	private Map<String, String> map;
	LeadsDetailsPage ldp;

	@Test(groups = "smoke", retryAnalyzer = retryFailedCases.class,dataProvider = "getValue" )
	public void verifyLeadsCreation(Object mapObjdata) {
		map=(Map<String, String>)mapObjdata;
		HomeLandingPage homePage = new HomeLandingPage(util);
		homePage.navigateToMarketingLeads();
		LeadsLandingPage llp = new LeadsLandingPage(util);
		LeadsCreationPage lcp = llp.clickOnCreateLeadsBtn();
		lcp.fillLeadsCreationInfo(map);
		ldp = lcp.clickOnSaveButtonInLdsCrnInfo();

	}
//	@Test(dependsOnMethods = "verifyLeadsCreation", priority = 1 , retryAnalyzer = retryFailedCases.class, groups = "regression")
//	public void verifyLeadsEdition() {
//		// HomeLandingPage homePage = new HomeLandingPage(util);
//		// homePage.navigateToMarketingLeads();
//		// LeadsLandingPage llp = new LeadsLandingPage(util);
//		// LeadsCreationPage lcp = llmapp.clickOnCreateLeadsBtn();
//		// lcp.fillLeadsCreationInfo();
//		// LeadsDetailsPage ldp = lcp.clickOnSaveButtonInLdsCrnInfo();
//
//		ldp.clickOnEditButton();
//		LeadsEditionPage lep = new LeadsEditionPage(util);
//		lep.editLeadsDetails(map);
//		ldp.clickOnSaveBtnAfterEdit();
//
//	}
//
//    @Test(dependsOnMethods = "verifyLeadsCreation", retryAnalyzer = retryFailedCases.class,  priority = 2, groups = {"smoke"})
//	public void verifyLeadsDeletion() {
//		// HomeLandingPage homePage = new HomeLandingPage(util);
//		// homePage.navigateToMarketingLeads();
//		// LeadsLandingPage llp = new LeadsLandingPage(util);
//		// LeadsCreationPage lcp = llp.clickOnCreateLeadsBtn();
//		// lcp.fillLeadsCreationInfo(map);
//		// LeadsDetailsPage ldp = lcp.clickOnSaveButtonInLdsCrnInfo();
//		// ldp.editLeadsCreationInfo();
//		// ldp.clickOnSaveBtnAfterEdit();
//		ldp.deleteLeadsCreationInfo();
//		ldp.handleDeletePopup();

//	}

}
