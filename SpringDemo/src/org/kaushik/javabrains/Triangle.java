package org.kaushik.javabrains;

public class Triangle {
	private String type;
	public void setType(String type)
	{
		this.type=type;
		
	}
	public String getType()
	{
		return type;
	}
	public void draw()
	{
		System.out.println(getType() + " Triangle drawn");
	}

}
