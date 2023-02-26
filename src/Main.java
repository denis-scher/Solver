import java.util.ArrayList;

import java.util.Stack;



public class Main {
    public static void main(String[] args) {
        //Scanner myObj = new Scanner(System.in);
        //System.out.println("Please Enter a simple math problem");

        double x = 13*-5.16+60-42*15;
        System.out.println(x);
        String problem = "13*-5.16+60-42*15"; //TODO:check if working properly.

        Solver solver = new Solver();
        ArrayList<Stack> decomp2 = solver.solve(problem);
        System.out.println(decomp2);




    }


}





