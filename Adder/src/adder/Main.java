package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
	  catch (NumberFormatException e){
            System.err.println("Please provide integers in your array.");
	}
    }

    private static int addArguments(String[] args) {
        int sum = Integer.valueOf(args[0]);
	for(int i = 1; i < args.length || i == 1; i++){
	    sum += Integer.valueOf(args[i]);
	}
	return sum;
    }
}
