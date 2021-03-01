

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=-1;
        for (int i=1,c=0;c<=1000;i++){
            if(isPrime(i)==0){
                sum=sum+i;
                c++;
                comparePrimes(sum);
            }
        }
        
	}
	
	public static int isPrime(int i){
		int flag = 0;
		for(int j=2;j<i;j++) 
        { 
            if(i%j==0) 
            {
                flag=1;
                break; 
            }
        }
    return flag;
	}
	
	public static int comparePrimes(int comp){
		String s = "";
		StringBuilder backwards = new StringBuilder();
		s = Integer.toString(comp);
		StringBuilder sb = new StringBuilder(s);
		backwards = sb.reverse();
		System.out.println(backwards);
		
		return comp;
	}

}
