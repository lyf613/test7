package 儿;

import java.util.Random;
import java.util.Scanner;

public class sonarray {
 public static int n;
 public static int max;
 public static int array[] = new int[100];
  void RandomArray(int n,int max) {
	  Random random = new Random();
	  for(int i = 0;i<n;i++) {
		  array[i] = random.nextInt(max);
	  }
  }
  
  int CheckOrder() {
	  int m=0;
	  for(int i=0;i<n;i++)
	  {
		  if(array[i]>array[i+1])
			m++;  
	  }
	  if(m!=0)
		  {return 0;}
	  else 
		  return 1;
  }
  
  int Sum() {
	  int sum=0;
	  for(int i = 0;i<n;i++) {
		  sum+=array[i];
	  }
	  return sum;
  }
  
  int CheckKey(int key) {
	  int m=0;
	  for(int i=0;i<n;i++) {
		  if(array[i] == key)
			  m++;
	  }
	  if(m!=0)
		  return 1;
	  else 
		  return 0;
  }
  public static void main(String[] args) 
  {
	  Scanner in = new Scanner(System.in);
	  int a, b;
	  n= in.nextInt();
	  max = in.nextInt();
	  sonarray bitch = new sonarray();
	  bitch.RandomArray(n, max);
	  System.out.println(bitch.CheckOrder());
	  System.out.println(bitch.Sum());
	  System.out.println("输入你要找的值");
	  System.out.println(bitch.CheckKey(in.nextInt()));
  }
}
