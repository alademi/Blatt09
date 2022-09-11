import java.util.LinkedList;

public class Node {
    private LinkedList<Edge> list ;
    private Integer id ;

    public Node (Integer id)
    {
        this.id = id ;
        list = new LinkedList<>();
    }

    public LinkedList<Edge> getList() {
        return list;
    }

    public Integer getId() {
        return id;
    }

    public void addEdge (Node dst)
    {
        list.add(new Edge(this,dst));

    }

    @Override
    public boolean equals (Object other)
    {
        return other == this ;
    }

    public String toString ()
    {
        return id + "" ;
    }



}
