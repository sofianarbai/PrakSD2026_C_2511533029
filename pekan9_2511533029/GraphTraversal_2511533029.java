package pekan9_2511533029;

import java.util.*;
public class GraphTraversal_2511533029 { 
	private Map<String, List<String>> graph_3029 = new HashMap<>();
	
	// menambahkan edge graf tak terarah
	public void addedge_3029 (String node1_3029, String node2_3029) {
		graph_3029.putIfAbsent (node1_3029, new ArrayList<>());
		graph_3029.putIfAbsent (node2_3029, new ArrayList<>());
		graph_3029.get (node1_3029).add(node2_3029);
		graph_3029.get(node2_3029).add(node1_3029);
	}
	// menampilkan graf awal
	public void printGraph_3029() {
		System.out.println("Graf awal (adjacency List): ");
		for (String node_3029 : graph_3029.keySet()) {
			System.out.print(node_3029 + " -> ");
			List<String> neighbors_3029 = graph_3029.get(node_3029);
			System.out.println(String.join(", ", neighbors_3029));
		}
		System.out.println();
	}
	
	// DFS rekursif
	public void dfs_3029 (String start_3029) {
		Set<String> visited_3029 = new HashSet<>();
		System.out.println("Penelusuran DFS: ");
		dfsHelper_3029 (start_3029, visited_3029);
		System.out.println();
	}
	private void dfsHelper_3029(String current_3029, Set<String> visited) {
		if (visited.contains(current_3029))
			return;
		visited.add(current_3029);
		System.out.print(current_3029 + " ");
		for (String neighbor_3029 : graph_3029.getOrDefault(current_3029, new ArrayList<>())) {
			dfsHelper_3029(neighbor_3029, visited);
		}
	}
	// BFS Iteratif
	public void bfs_3029(String start_3029) {
	    Set<String> visited_3029 = new HashSet<>();
	    Queue<String> queue_3029 = new LinkedList<>();

	    queue_3029.add(start_3029);
	    visited_3029.add(start_3029);

	    System.out.println("Penelusuran BFS:");

	    while (!queue_3029.isEmpty()) {
	        String current_3029 = queue_3029.poll();
	        System.out.print(current_3029 + " ");
	        for (String neighbor_3029 :
	                graph_3029.getOrDefault(current_3029, new ArrayList<>())) {
	            if (!visited_3029.contains(neighbor_3029)) {
	                queue_3029.add(neighbor_3029);
	                visited_3029.add(neighbor_3029);
	            }
	        }
	    }

	    System.out.println();
	}
	// Main
	public static void main(String[] args_3029) {

	    GraphTraversal_2511533029 graph_3029 = new GraphTraversal_2511533029();

	    // Contoh graf: A-B, A-C, B-D, B-E
	    graph_3029.addedge_3029("A", "B");
	    graph_3029.addedge_3029("A", "C");
	    graph_3029.addedge_3029("B", "D");
	    graph_3029.addedge_3029("B", "E");

	    // Cetak graf awal
	    System.out.println("Graf Awal adalah:");
	    graph_3029.printGraph_3029();

	    // Lakukan penelusuran
	    graph_3029.dfs_3029("A");
	    graph_3029.bfs_3029("A");
	}
}
