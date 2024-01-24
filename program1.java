import java.util.*;
class OnesDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		OnesDemo obj=new OnesDemo();
		System.out.println("Enter array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=obj.fun(arr);
		System.out.println("output = "+count);
	}
	int fun(int arr[]){
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				count++;
				if(count>max){
					max=count;
				}
			}else{
				count=0;
			}
		}
		return max;
	}
}
