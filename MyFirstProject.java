

public class CountCharacters {

	public static void main(String[] args) {
		String str = "Hello I am chesta";    
        int count = 0;    
        System.out.println("The entered string is: "+str);    
        //Count the characters in the string except space    
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) != ' ')    
                count++;    
        }                
        //Displays the total number of characters in the string    
        System.out.println("Total number of characters in the string: " + count);    
    }      
}
