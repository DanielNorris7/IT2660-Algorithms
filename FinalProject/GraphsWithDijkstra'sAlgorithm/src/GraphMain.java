import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GraphMain 
{

	public static void main(String[] args) 
	{
		Random randomNumber = new Random();
		
		int numberOfNodes = 100000;
		// Generate a (positive) number of connections.
		int numberOfConnections = Math.abs(randomNumber.nextInt(5));
		int nodeValue = Math.abs(randomNumber.nextInt(30000));
		Graph graph = new Graph(numberOfNodes);
		
		int vertexNum = Math.abs(randomNumber.nextInt(3));
		
		List<Listing2> listingList = new ArrayList<Listing2>();
		Listing2 vortex = new Listing2();
		// Create the a new node and insert it into the graph.
		for (int i = 0; i < numberOfNodes; i++)
		{
			vortex = new Listing2(Math.abs(randomNumber.nextInt(300)));
			listingList.add(vortex);
			
			graph.InsertVertex(i, vortex);
			
			// Insert the the edges.
			for (int j = 0; j < nodeValue; j++)
			{
				graph.InsertEdge(numberOfConnections, Math.abs(randomNumber.nextInt(vertexNum)));
			}
		}
		
		Listing2 firstListing = new Listing2(Math.abs(randomNumber.nextInt()));
		Listing2 secondListing = new Listing2(Math.abs(randomNumber.nextInt()));
		
		vortex.AddNeighbour(new Edge(Math.abs(randomNumber.nextInt()), firstListing, secondListing));

		
		// This is where the user can input their value.
		System.out.println("Depth-First:");
		graph.DepthFirstSearch(3);
		
		System.out.println();
		System.out.println("Breadth First:");
		graph.BreadthFirstSearch(3);
		System.out.println();
		
		System.out.println();
		System.out.println("Dijkastra Alhorithm:");
		// Enter in the Listing2 that you would like to compute.
		
		graph.ComputeShortestPaths(firstListing);
		graph.GetShortestPathTo(firstListing);
		System.out.println("Minimum distance from 1st to 2nd: "+ firstListing.GetDistance());
		System.out.println("Minimum distance from 1st to 2nd: "+ secondListing.GetDistance());
		System.out.println("Shortest Path from 1st to 2nd: "+ graph.GetShortestPathTo(secondListing));
		System.out.println("Total number of nodes examined during the search " + graph.numberOfVertices);
	}

}
