//1791. Find Center of Star Graph

package sample;

public class CenterStarGraph {
	public int findCenter(int[][] edges) {

		int a = edges[0][0];
		int b = edges[0][1];

		int c = edges[1][0];
		int d = edges[1][1];

		if (a == c || a == d) {
			return a;
		} else {
			return b;

		}
	}

	public static void main(String[] args) {
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 4, 2 } };
		CenterStarGraph obj = new CenterStarGraph();
		int result = obj.findCenter(edges);
		System.out.println("CenterStarGraph:" + result);

	}

}