public class CountNines {
	public static int getCountNines(int a, int b) {
		int count = 0;
		int rem,num;
		if(a < 0 || b < 0) {
			return -1;
		}
		if(a == 0 || b == 0){
			return -2;
		}
		if(a < b) {
			for(int i = a ; i <= b ; i++) {
				num = i;
				while(num > 0) {
					rem = num%10 ;
					if(rem == 9) {
						count++;
					}
					num = num/10;
				}				
			}
		}
		if(a > b) {
			for(int j = a ; j >= b ; j--) {
				num = j;
				while(num > 0) {
					rem = num % 10 ;
					if(rem == 9) {
						count++;
					}
					num = num / 10;
				}
			}
		}
		if(count == 0) {
			return -3;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(getCountNines(30, 20));
	}

}