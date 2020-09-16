package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide three integers to add");
        }
	  catch (Exception e){
	    System.err.println("Error: Less than 3 integers");
	}
    }

    private static int addArguments(String[] args) {
        if(Integer.valueOf(args[0]) == "-"){
		return (Integer.valueOf(args[1] + Integer.valueOf(args[2])) * -1;
	}
	else{
		return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]); 
    	}
    }
}
