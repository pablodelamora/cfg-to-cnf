
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String args[]) {

        try {
            BufferedReader in = new BufferedReader(new FileReader("arq.txt"));
            String s;
            while ((s = in.readLine()) != null) {
                int l = s.length();
                for (int i = 0; i < l; i++) {
                    System.out.println(s.substring(i, i + 1));
                }
                System.out.println("End of line");
            }
            in.close();
        } catch (IOException e) {
        }
        // System.exit(0);
    }   // 192.168.16.20
    // 192.168.14.172
}
