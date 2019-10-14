package yumenu.backend.beam.dataStructures;

import java.util.ArrayList;

import yumenu.backend.beam.recipe.Recipe;

public class Menu extends ArrayList<Recipe> {

	
	private static final long serialVersionUID = -8133597377913764662L;
	
	public ArrayList<Recipe> getRecipes() {
		return this;
	}

	
	public void setRecipes(ArrayList<Recipe> list) {
		this.clear();
		this.addAll(list);
	}
}
