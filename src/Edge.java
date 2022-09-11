public class Edge {

    private Node dst ;
    private Node src ;

    public Edge (Node src , Node dst)
    {
         this.src = src ;
         this.dst = dst ;
    }

    public Node getDst() {
        return dst;
    }

    public Node getSrc() {
        return src;
    }

    public String toString()
    {
        return dst.toString();
    }
}
