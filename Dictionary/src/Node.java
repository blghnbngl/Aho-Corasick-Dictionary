import java.util.ArrayList;
import java.util.List;

public class Node {

	int identity;
	int parent;
	int fallBack;
	int output;
	//int depth;
	//char incoming;
	
	//List<node> nodes=new ArrayList<node>();

	List<Character> children;
	List<Integer> transitions;
	
	//boolean leaf;
	
	public Node(int par,int ide) {
		// TODO Auto-generated constructor stub

		//Define the identity, parent,children etc

		identity=ide;
		parent=par;
		//leaf=true;		//Unless it has a child
		children = new ArrayList<Character>();		//These are characters that lead to state transition
		transitions = new ArrayList<Integer>();		//Result of each state transition
		fallBack=0;		//node to go in the case of a failure
		output=0;		//Number of characters to put stars on, lenght of censored word
		//depth=0;
	}

}
