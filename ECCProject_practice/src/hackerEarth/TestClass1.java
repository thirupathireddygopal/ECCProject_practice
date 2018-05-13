package hackerEarth;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass1 {
    public static void main(String args[] ) throws Exception {
    	InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ip);
        
        System.out.println("enter your name");
        
        // read the name from the input 
        String line = br.readLine();
        
        // print the name
        System.out.println("Hello "+ line);
        
    }
}

// Just click on SUBMIT to run the code