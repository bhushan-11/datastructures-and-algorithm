package graph;

import java.util.LinkedList;

public class IsPathNodes {

	
	public class Graph{
		
		private Node [] graphNodes;

		public Node[] getGraphNodes() {
			return graphNodes;
		}

		public Graph(Node[] graphNodes) {
			super();
			this.graphNodes = graphNodes;
		}

		public void setGraphNodes(Node[] graphNodes) {
			this.graphNodes = graphNodes;
		}
		
		
	}
	
	public class Node{
	
	private State state;
		public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
		private String nameString;
		public String getNameString() {
			return nameString;
		}
		public void setNameString(String nameString) {
			this.nameString = nameString;
		}
		public Node(String nameString, Node[] adjacent) {
			super();
			this.nameString = nameString;
			this.adjacent = adjacent;
		}
		public Node[] getAdjacent() {
			return adjacent;
		}
		public void setAdjacent(Node[] adjacent) {
			this.adjacent = adjacent;
		}
		private Node adjacent[] ;
	}
	
	
	enum State { Unvisited, Visiting,Visited}
	
	
	boolean search(Graph g,Node start, Node end) {
		
		if(start==end) {
			return true;
		}
		
		LinkedList<Node> list= new LinkedList<>();  //acts as a queue
		
		for(Node u: g.getGraphNodes()) {
			u.state=State.Unvisited;
		}
		
		start.state= State.Visiting;
		list.add(start);
		Node u;
		
		while(!list.isEmpty()) {
			
			u= list.removeFirst();
			if(u!=null) {
				for(Node v: u.getAdjacent()) {
					if(v.state == State.Unvisited) {
						if(v == end) {
							return true;
						}else {
							v.state=State.Visiting;
							list.add(v);
						}
					}
				}
			}
		}
		
		return false;
	}
}
