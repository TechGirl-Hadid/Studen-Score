import java.util.Scanner;
class testScore
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your subjct num :");
		int length=s.nextInt();
		int[] score =new int[length];

		 for (int x=0; x<length ;x++ ) { // for gitting sebject score
		 	System.out.print("enter your subject score : ");
		 	score[x]=s.nextInt();

		 }
		  int totalScore=studentMark(score); //fun sotred in a variable for tha
          System.out.println("your total score : " + totalScore );
          System.out.println("your % score : " + (float)totalScore/(float)length);
          System.out.println("your max score : " + max(score));
          System.out.println("your min score : " + min(score));
	}//main method
	
	  static int min(int[] numbers ){
         int min = numbers[0];
         for (int n : numbers) {
         	if (n<min) {
         		min=n;
         	}
         	
         }
         return min;
     }//fun3

	 static int max(int[] numbers ){
         int max = numbers[0];
         for (int n : numbers) {
         	if (n> max) {
         		max=n;
         	}
         }
  			return max;
	 }//fun2

      static int studentMark(int[] numbers){
      	 int total=0;
      	 for (int n : numbers) {
      	 	total=total+n;
      	 }
      	  return total;

      }

} //class