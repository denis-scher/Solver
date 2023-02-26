import java.util.ArrayList;

import java.util.Stack;



public class Main {
    public static void main(String[] args) {
        //Scanner myObj = new Scanner(System.in);
        //System.out.println("Please Enter a simple math problem");


        String problem = "13*5.16+56.2+3/2.45";

        Solver solver = new Solver();
        ArrayList<Stack> decomp2 = solver.solve(problem);
        System.out.println(decomp2);




    }


}





