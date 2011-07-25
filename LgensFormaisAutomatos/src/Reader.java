
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class Reader {

    private String firstVariable;
    private String oldFirstVariable;

    public void setFirstVariable() {
        System.out.println(firstVariable + "..1");
        try {
            BufferedReader in = new BufferedReader(new FileReader("g1.dat"));
            String line;
            int lineSize;
            while ((line = in.readLine()) != null) {
                lineSize = line.length();
                if (lineSize == 1) {
                    firstVariable = line;
                }
            }
            in.close();
        } catch (IOException e) {
        }
    }

    public String getFirstVariable() {
        return firstVariable;
    }

    public void setNewFirstVariable() {
        Reader reader = new Reader();
        String str = reader.getFirstVariable();
        oldFirstVariable = str;
        firstVariable = str + "'";
    }

    public void checkFirstStep() {

        try {
            BufferedReader in = new BufferedReader(new FileReader("g1.dat"));
            String line;
            String tmp;
            int index;
            while ((line = in.readLine()) != null) {
                index = line.indexOf(">");
                if (index != -1) {
                    tmp = line.substring(index + 1);
                    index = tmp.indexOf(firstVariable);
                    if (index != -1) {
                        //System.out.println(index);
                        //significa q ele encontrou a variavel entao o passo 1 deve ser corrigido
                        Reader reader = new Reader();
                        reader.setNewFirstVariable();
                        System.out.println(firstVariable + "..2");
                        System.out.println(oldFirstVariable + "..2");
                        BufferedWriter out = new BufferedWriter(new FileWriter("g1s.dat"));
                        int l;
                        int lines = 1;
                        String str;
                        while ((line = in.readLine()) != null) {
                            l = line.length();
                            for (int i = 0; i < l; i++) {
                                str = line.substring(i, i + 1);
                                if (lines == 1) {
                                    if (i == 1) {
                                        out.write(firstVariable);
                                        out.write(",");
                                    }
                                    out.write(str);
                                }
                            }
                        }
                        out.close();
                    }
                }
                index = 0;
            }
            in.close();

        } catch (IOException e) {
        }
    }

    public int getNumberOfLines() throws FileNotFoundException, IOException {
        File file = new File("g1.dat");
        LineNumberReader line = new LineNumberReader(new FileReader(file));
        line.skip(file.length());
        return line.getLineNumber();
    }

    public static void main(String args[]) {

        Reader reader = new Reader();
        reader.setFirstVariable();
        //System.out.println(reader.getFirstVariable());
        reader.checkFirstStep();

    }
}
