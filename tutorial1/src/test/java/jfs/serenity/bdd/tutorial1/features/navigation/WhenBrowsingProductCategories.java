package jfs.serenity.bdd.tutorial1.features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import jfs.serenity.bdd.tutorial1.steps.NavigatingUser;
import jfs.serenity.bdd.tutorial1.model.Category;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {
	
	@Steps
	NavigatingUser john;
	
	@Managed
	WebDriver browser;
	
	@Test
	public void shouldBeAbleToNavigateToTheMotorsCategory() {
		//Given
		//john is Persona
		john.isOnTheHomePage();
		//When
		john.navigatesToCategory(Category.Motors);
		//Then
		john.shouldSeePageTitleContaining("New & Used Cars");
		
	}

}
