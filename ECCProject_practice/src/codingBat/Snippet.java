package codingBat;

public class Snippet {
	public String frontBack(String str) {
	  String result = "";
	  if(str.length() == 1){
	    return str;
	  }
	  
	  else{
	  return (str.charAt(str.length()-1) + str.substring(1,str.length()-2) + str.charAt(0));
	  }
	}

	public boolean mixStart(String str) {
	  if((str.charAt(1) == 'i') && (str.charAt(2) =='x')){
	    return true;
	  }
	  return false;
	}
	
}

