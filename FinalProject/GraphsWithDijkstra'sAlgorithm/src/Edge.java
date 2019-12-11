
public class Edge 
{
	private double weight;
	private Listing2 startVertex;
	private Listing2 targetVertex;
	
	public Edge(double weight, Listing2 startVertex, Listing2 targetVertex) 
	{
		this.weight = weight;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}
 
	public double GetWeight() 
	{
		return weight;
	}
 
	public void SetWeight(double weight) 
	{
		this.weight = weight;
	}
 
	public Listing2 GetStartVertex() 
	{
		return startVertex;
	}
 
	public void SetStartVertex(Listing2 startVertex) 
	{
		this.startVertex = startVertex;
	}
 
	public Listing2 GetTargetVertex() 
	{
		return targetVertex;
	}
 
	public void SetTargetVertex(Listing2 targetVertex) 
	{
		this.targetVertex = targetVertex;
	}
}
