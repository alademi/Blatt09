import java.io.*;
import java.util.*;




public class Graph {
    private int n;
    private int m;
    private ArrayList<Node> nodeList;

    public Graph(int n, int m) {
        this.n = n;
        this.m = m;
        nodeList = new ArrayList<Node>();
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public ArrayList<Node> getNodeList() {
        return nodeList;
    }

    public boolean contains(int id) {
        for (Node n : nodeList) {
            if (id == n.getId()) {
                return true;
            }
        }
        return false;
    }

    public Node getNode(int id) {
        for (Node n : nodeList) {
            if (id == n.getId()) {
                return n;
            }
        }
        return null;
    }

    public boolean addEdge(int src, int dst) {
        if (contains(src) && contains(dst)) {

            for (Node n : nodeList) {
                if (n.getId() == src) {
                    Node n2 = new Node(dst);
                    n.addEdge(n2);
                    break;
                }
            }
            return true;
        }
        return false;
    }

    static Graph fromFile(String filepath) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            try {
                String line = "";
                for (int i = 0; i < 5; i++) {
                    line = br.readLine();
                }
                StringTokenizer st = new StringTokenizer(line);

                int x = 0;
                int y = 0;
                int count = 0;
                while (st.hasMoreTokens()) {
                    count++;

                    String s = st.nextToken();

                    if (count == 3) {
                        x = Integer.parseInt(s);
                    }
                    if (count == 4) {
                        y = Integer.parseInt(s);
                    }
                }


                Graph g = new Graph(x, y);
                String r;
                while ((r = br.readLine()) != null) {
                    StringTokenizer h = new StringTokenizer(r);
                    int c = 0;
                    int a = 0;
                    int b = 0;
                    while (h.hasMoreTokens()) {
                        c++;

                        String q = h.nextToken();

                        if (c == 2) {
                            a = Integer.parseInt(q);
                        }
                        if (c == 3) {
                            b = Integer.parseInt(q);
                        }
                    }


                    if (!g.contains(a)) {
                        Node n1 = new Node(a);
                        g.nodeList.add(n1);
                    }

                    if (!g.contains(b)) {
                        Node n2 = new Node(b);
                        g.nodeList.add(n2);
                    }

                    g.addEdge(a, b);


                }

                Collections.sort(g.nodeList, Comparator.comparing(Node::getId));
              // g.printList(g.nodeList);


                return g;

            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return null;
        }
    }


    public String toString() {
        for (Node n : nodeList) {
            if(n.getList().isEmpty())
            {
                System.out.println("Knoten " + n + " verbunden zu :  ");
            }
            for (Edge e : n.getList()) {
                System.out.println("Knoten " + n + " verbunden zu : " + e.getDst());
            }
        }
        return "";
    }




}
