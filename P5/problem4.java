package module5;

public class problem4 {
	public static void main(String[] args) {
		int product = 0;       //initiate the product as 0
    	for(int n = 1; n<=10; n++) {  //uses a nessed for loop to print the products of numbers
    		for(int i=1; i <= 10; i++)
    		{
    			product = n * i;
    			System.out.print(product + " ");
    		}
			if(product % 10 == 0) { // if the number is a multiple of 10, it breaks to the next line
    			System.out.println();
    		}
    	}
	}

}
