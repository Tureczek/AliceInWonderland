import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Read read = new Read();

        System.out.print("Total numbers of characters including spaces: ");
        read.getChars();
        System.out.println();
        System.out.print("Total numbers of characters excluding spaces: ");
        read.getCharNoSpace();
        System.out.println();
        System.out.println();

        read.instances();
    }
}
