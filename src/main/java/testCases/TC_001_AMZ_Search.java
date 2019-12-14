package testCases;

import org.testng.annotations.Test;

import main_POM.MainRun;
import pages.amazon.in.SearchPage;

public class TC_001_AMZ_Search extends MainRun {
	
	@Test
	
	public void run() {
		
		new SearchPage()
		.search()
		.searchresult()
		.product()
		.confirm()
		.purchase();
		
	}
}
