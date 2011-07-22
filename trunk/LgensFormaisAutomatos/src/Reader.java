
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Reader {

    private int lineNumber;

    public int getNumberOfLines() throws FileNotFoundException, IOException {
        File file = new File("g1.dat");
        LineNumberReader line = new LineNumberReader(new FileReader(file));
        line.skip(file.length());
        return line.getLineNumber();
    }

    public String getLine(int lineNumber) {
        this.lineNumber = lineNumber;
        String line = null;
        try {
            BufferedReader in = new BufferedReader(new FileReader("g1.dat"));
            while (line != null) {
                line = in.readLine();
                return line;
            }
            in.close();
        } catch (IOException e) {
        }
        return null;
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {

        Variable v = new Variable();
        Reader reader = new Reader();
        System.out.println(reader.getNumberOfLines());
//
//        try {
//            BufferedReader in = new BufferedReader(new FileReader("g1.dat"));
//            String line;
//            String aux;
//            while ((line = in.readLine()) != null) {
//                int l = line.length();
//                for (int i = 0; i < l; i++) {
//                    aux = line.substring(i, i + 1);
//                    if (aux.equals(">")) {
//                    }
//                }
//                //System.out.println("End of line");
//            }
//            in.close();
//        } catch (IOException e) {
//        }
        // System.exit(0);
    }
}
