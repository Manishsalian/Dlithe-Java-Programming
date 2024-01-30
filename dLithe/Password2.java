package dLithe;
import java.util.Scanner;
public class Password2
{
    static boolean validPassword(String password)
    {
    	Boolean uppercase=false;
        Boolean lowercase=false;
        Boolean special=false;
        Boolean digit=false;
        Boolean length=false;
        if(password.length()>= 8)
        {
        	length=true;
            for(int i=0;i<password.length();i++){
                if(Character.isLowerCase(password.charAt(i)))
                {
                    lowercase=true;
                    break;
                } 
                else lowercase=false;
            }    
            for(int i=0;i<password.length();i++){
                if(Character.isUpperCase(password.charAt(i))){
                    uppercase=true;
                    break;
                }
                else uppercase= false;
            }
            for(int i=0;i<password.length();i++){
                if(Character.isDigit(password.charAt(i))){
                    digit=true;
                    break;
                }
                else digit= false;
            }
            if(password.contains(" ")){
                return false;
            }
            
            for(int i=0;i<password.length();i++)
            if(!Character.isDigit(password.charAt(i))&&!Character.isUpperCase(password.charAt(i))
            		&& !Character.isLowerCase(password.charAt(i))){
                special=true;
                break;
            }
            else special=false;
        }
        
        else{ 
            length =false;
        }
        if(uppercase==false||lowercase==false || 
        		special==false || digit==false || length==false)
        	return false;
        
        return true;
        		
        		
        
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String password=s.nextLine();
		s.close();
		if(validPassword(password)) {
		    System.out.print(1);
	    }
	    else System.out.print(0);
	}
}