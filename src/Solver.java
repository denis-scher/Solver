import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solver {

    public ArrayList<Stack> solve (String problem){
        ArrayList<Stack> arrL = new ArrayList<>();
        Stack<Double> values =new Stack<>();
        Stack<String> operators = new Stack<>();
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9","."));
        int i = problem.length() - 1;
        int j = i;
        while (i >= 0){
            if(numbers.contains(String.valueOf(problem.charAt(i)))){
                i--;
                if (i == 0) {
                    values.push(Double.parseDouble(problem.substring(i, j + 1)));
                    break;
                }
                continue;
            }
            values.push(Double.parseDouble(problem.substring(i+1,j+1)));
            switch (String.valueOf(problem.charAt(i))){
                case "*":
                case "/":
                    operators.push(problem.substring(i,i+1));
                    i--;
                    j=i;
                    break;
                case "+":
                case "-":
                    if (operators.peek().equals("*") || operators.peek().equals("/")){
                        String operator = operators.pop();
                        double valA = values.pop();
                        double valB = values.pop();
                        double valC;
                        if (operator.equals("*")) {
                            valC = valA * valB;
                        }else{
                            valC = valA / valB;
                        }
                        values.push(valC);
                        operators.push(problem.substring(i,i+1));
                        i--;
                        j=i;
                        break;
                    }
                    else {
                        operators.push(problem.substring(i,i+1));
                        i--;
                        j=i;
                    }


            }

        }

        while(operators.isEmpty() == false){
            String operator = operators.pop();
            double valA = values.pop();
            double valB = values.pop();
            double valC;
            switch (operator){
                case "+":
                    valC = valA + valB;
                    values.push(valC);
                    break;
                case "-":
                    valC = valA - valB;
                    values.push(valC);
                    break;
                case "*":
                    valC = valA * valB;
                    values.push(valC);
                    break;
                case "/":
                    valC = valA / valB;
                    values.push(valC);
                    break;
            }
        }

        arrL.add(values);
        arrL.add(operators);
        return arrL;
    }
}
