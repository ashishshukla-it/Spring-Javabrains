package org.kaushik.javabrains;
import java.util.List;

public class Triangle 
{
    private List<Point> points;
    
    public List<Point> getPoints()
    {
    	return this.points;
    }
    
    public void setPoints(List<Point> points)
    {
    	this.points=points;
    }
	public void draw()
	{
		for(Point i:points)
		{
			System.out.println("Point : ( "+i.getX() + " ," + i.getY()+ ")");
		}
		
		
		
	}

}
