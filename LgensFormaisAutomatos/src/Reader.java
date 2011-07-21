
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String args[]) {

        Variable v = new Variable();

        try {

            BufferedReader in = new BufferedReader(new FileReader("g1.dat"));
            String s;
            String aux;
            while ((s = in.readLine()) != null) {
                int l = s.length();
                for (int i = 0; i < l; i++) {
                    aux = s.substring(i, i + 1);
                    //System.out.println(aux);
                    //System.out.println(v.verifyString(aux));
                }
                //System.out.println("End of line");
            }
            in.close();
        } catch (IOException e) {
        }
        // System.exit(0);
    }
}
