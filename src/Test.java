import java.util.LinkedList;
import java.util.Queue;

public class Test {


        public int breitsuche (Graph g , int s  , int t)
        {
            boolean[] visited = new boolean[g.getN()];

            int[] parent = new int[g.getN()];
            Queue<Node> q = new LinkedList<>();
            q.add(new Node(s));
            parent[s] = -1 ;
            visited[s] = true ;

            while (!q.isEmpty())
            {
                Node current = q.poll() ;
                if (current.getId() == t)
                {
                    break ;
                }

            }
            return 1 ;
        }


        public static void main(String[] args) {
            Test t = new Test();
            Graph g = Graph.fromFile("C:\\Users\\aalad\\Downloads\\1\\BspGraphKlein.graph") ;
             t.breitsuche(g,1,2);
        }

    }



