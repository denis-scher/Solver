import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;



public class Main {
    public static void main(String[] args) {
        //Scanner myObj = new Scanner(System.in);
        //System.out.println("Please Enter a simple math problem");

        String problem = new String();
        problem = "13*5.16+56.2+3/2.45";
        Tokenizer tokenizer = new Tokenizer();
        //ArrayList<Stack> decomp = new ArrayList<>();

        ArrayList<Stack> decomp = tokenizer.tokenize(problem);
        System.out.println(decomp);
        Solver solver = new Solver();
        ArrayList<Stack> decomp2 = solver.tokenize(problem);
        System.out.println(decomp2);
        TypeTest typeTester = new TypeTest();



    }


}





