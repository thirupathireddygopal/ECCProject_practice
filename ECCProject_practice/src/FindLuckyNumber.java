public class FindLuckyNumber {
    public static void main(String[] args) {
        String date = "15-March-2016";
        System.out.println(getLuckyNumber(date));
    }

    public static int getLuckyNumber(String date) {
    	//System.out.println("entered getLuckyNumber");
    	int luckyNumber = 0;
    	String dmy[] = date.split("-");
    	int month = convertMMMtoMM(dmy[1]);
    	dmy[1] = ""+month;
    	for(int i=0;i<dmy.length;i++) {
    		luckyNumber += Integer.parseInt(dmy[i]);
    	}
    	while(luckyNumber>=10) {
    		luckyNumber = getSumOfDigits(luckyNumber);
    	}
    	return luckyNumber;
    }

    public static int convertMMMtoMM(String mon) {
    	//System.out.println("entered convertedMMMtoMM");
         int result = 0;
         String month = mon.toLowerCase();
         //System.out.println(month);
		 String a[] = {"january","february","march","april","may","june","july",
				 "august","september","october","november","december"};
		 //System.out.println(a[0]);
		 //System.out.println(a.length);
		 for(int i = 0;i<a.length;i++) {
			 if(a[i].contains(month)) {
				 //System.out.println(a[i]);
				 result+=i+1;
				 System.out.println(i);
			 }
		 }
		 return result;
    }
    
    public static int getSumOfDigits(int num) {
    	System.out.println("getSumOfDigits");
    	int sum = 0,rem;
        while(num>0) {
        	rem = num%10;
        	sum += rem;
        	num = num/10;
        }
        return sum;
    }
}