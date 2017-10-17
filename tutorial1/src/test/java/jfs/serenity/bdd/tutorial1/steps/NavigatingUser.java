package jfs.serenity.bdd.tutorial1.steps;

import jfs.serenity.bdd.tutorial1.model.Category;
import jfs.serenity.bdd.tutorial1.ui.CategoryNavigationBar;
import jfs.serenity.bdd.tutorial1.ui.CurrentPage;
import jfs.serenity.bdd.tutorial1.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

	EbayHomePage ebayHomePage;
	CurrentPage currentPage;
	CategoryNavigationBar categoryNavigationBar;
	
	@Step
	public void isOnTheHomePage() {
		ebayHomePage.open();
		// TODO Auto-generated method stub
		
	}
	
	@Step
	public void shouldSeePageTitleContaining(String expectedTitle) {
		// TODO Auto-generated method stub
		assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
	}
	
	@Step
	public void navigatesToCategory(Category category) {
		// TODO Auto-generated method stub
		categoryNavigationBar.selectCategory(category);
		categoryNavigationBar.selectCategory(category);
	}
	


}
