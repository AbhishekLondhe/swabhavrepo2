package com.techlabs.guitar;

public class GuitarSpec {

	private String model;
	private Builder builder;
	private Type type;
	private Wood topWood, backWood;
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type,int numStrings, Wood backWood, Wood topWood) {
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.numStrings=numStrings;
		this.backWood=backWood;
		this.topWood=topWood;

	}
	
	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	public int getNumStrings() {
		return numStrings;
	}
	
	public boolean matches(GuitarSpec otherSpec) {
		if (builder!= otherSpec.getBuilder())
			return false;
		String model = otherSpec.getModel().toLowerCase();
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel())))
			return false;
		if (type!= otherSpec.getType())
			return false;
		if (numStrings!= otherSpec.getNumStrings())
			return false;
		if (backWood!= otherSpec.getBackWood())
			return false;
		if (topWood!= otherSpec.getTopWood())
			return false;
		return true;
	}
}
