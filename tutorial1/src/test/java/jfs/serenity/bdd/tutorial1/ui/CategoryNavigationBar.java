package jfs.serenity.bdd.tutorial1.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import jfs.serenity.bdd.tutorial1.model.*;

public class CategoryNavigationBar extends PageObject {

	public void selectCategory(Category category) {
		//can search DOM from console of browser using criteria below to make sure it matches 1 object
		//(*[role=navigation] *[role=list]")
		//findBy XPath or CSS
		$("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();
	}
}
