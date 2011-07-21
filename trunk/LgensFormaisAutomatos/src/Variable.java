
public class Variable {

    //possible variables
    private String[] variables = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                                  "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    //possible terminals
    private String[] terminals = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                                  "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                                  "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    private String str;

    private boolean verifyString (String str) {
        this.str = str;
        for (String var : variables) {
            if (str.equals(var)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "Z";
        Variable v = new Variable();
        System.out.println(v.verifyString(str));
    }
}
