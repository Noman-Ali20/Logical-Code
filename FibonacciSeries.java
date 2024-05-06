package questions;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8,firstTerm=0,secondTerm=1,nextTerm;
	      for(int i=1;i<=n;++i){
	           System.out.print(firstTerm + " ");
	          
	           nextTerm = firstTerm+secondTerm;
	          firstTerm = secondTerm;
	          secondTerm = nextTerm;
	      }
	}

}
