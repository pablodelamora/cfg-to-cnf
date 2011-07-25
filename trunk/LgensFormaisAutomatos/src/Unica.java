
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Unica {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        String firstVariable = "A'";
        String oldFirstVariable = "A";
        int lineNumber = 1;

        BufferedReader in = new BufferedReader(new FileReader("g1.dat"));
        BufferedWriter out = new BufferedWriter(new FileWriter("g1s.dat"));
        String line;
        while ((line = in.readLine()) != null) {
            if (line.length() == 1) {
                out.write("\r\n" + firstVariable);
            } else {
                if (lineNumber == 1) {
                    out.write("{" + firstVariable + "," + line.substring(1, line.length()));
                } else if (lineNumber == 3) {
                    out.write("\r\n{" + firstVariable + "->" + oldFirstVariable);
                    out.write("\r\n" + line.substring(1, line.length()));
                } else {
                    out.write("\r\n" + line);
                }
            }
            lineNumber++;
        }
        out.close();
    }
}
