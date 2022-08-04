
public class AverageValue {

	public static void main(String[] args) {
		
			 
			       int[] numbers = new int[]{10, 20, 30, 40, 50, 100};       
			       int sum = 0;
			       for(int i=0; i < numbers.length ; i++)
			        sum = sum + numbers[i];
			       //calculate average value
			        double avg = sum / numbers.length;
			        System.out.println("Average value of the array elements is : " + avg); 
			   }
			}


    

