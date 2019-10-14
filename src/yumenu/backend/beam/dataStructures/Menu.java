package yumenu.backend.beam.dataStructures;

import java.util.ArrayList;

import yumenu.backend.beam.recipe.RType;
import yumenu.backend.beam.recipe.Recipe;

public class Menu extends ArrayList<Recipe> {

	
	private static final long serialVersionUID = -8133597377913764662L;
	
	
	public ArrayList<Recipe> getByType(RType recipeType) {
		ArrayList<Recipe> res = new ArrayList<Recipe>();
		for(Recipe r: this) {
			if(r.getRecipeType().equals(recipeType)) {
				res.add(r);
			}
		}
		
		return res;
	}
	
	public ArrayList<Recipe> getRecipes() {
		return this;
	}

	
	public void setRecipes(ArrayList<Recipe> list) {
		this.clear();
		this.addAll(list);
	}
}
