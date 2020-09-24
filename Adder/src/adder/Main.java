package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
    }

    private static int addArguments(String[] args) {
         int sum = 0;
	 if(args[0] == '-'){
	  sum -= Integer.valueOf(args[1]);
	  for(int i = 2; i < args.length || i == 2; i++){
	    sum -= Integer.valueOf(args[i]); 	
 	  }
	}
	else{
	   sum = Integer.valueOf(args[0]);
	   for(int i = 1; i < args.length || i == 1; i++){
	     sum += Integer.valueOf(args[i]);
	   }
	}
	return sum;
    }
}
