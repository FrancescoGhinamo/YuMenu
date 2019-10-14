package yumenu.backend.beam.recipe;

public class Recipe {

	private String name;
	private RType recipeType;
	
	private String ingredients;
	private String coockingProcedure;
	
	private String notes;

	public Recipe(String name, RType recipeType) {
		super();
		this.name = name;
		this.recipeType = recipeType;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getCoockingProcedure() {
		return coockingProcedure;
	}

	public void setCoockingProcedure(String coockingProcedure) {
		this.coockingProcedure = coockingProcedure;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getName() {
		return name;
	}

	public RType getRecipeType() {
		return recipeType;
	}
	
	

	
	
}
