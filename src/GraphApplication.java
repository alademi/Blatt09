import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GraphApplication {
    public static void main(String[] args) throws FileNotFoundException {

        if (args[0].equals("BspGraphKlein.graph")) {
            Objects.requireNonNull(Graph.fromFile("D:\\Downloads\\graphen (1)\\graphen\\BspGraphKlein.graph")).toString();
        }

        if (args[0].equals("BspGraphGross.graph")) {
            Objects.requireNonNull(Graph.fromFile("C:\\Users\\aalad\\Downloads\\graphen\\graphen\\BspGraphGross.graph")).toString();
        }

        if (args[0].equals("BspGraphGross2.graph")) {
             Graph.fromFile ("C:\\Users\\aalad\\Downloads\\graphen\\graphen\\BspGraphGross2.graph").toString();
        }

    }
}
