import java.util.*;
class EvenOddDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		System.out.println("Enter array elements");
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		fun(arr,N);
		System.out.println("OutPut");
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
	}
	static void fun(int[] arr, int N) {
		int i=0;
	        int j=1;
		while(i<N && j<N){
	            if(arr[i]%2 !=0 && arr[j] %2==0){
	                    int temp=arr[i];
	                    arr[i]=arr[j];
			    arr[j]=temp;
										                    
			    i=i+2;
			    j=j+2;
		    }else{
			    if(arr[i]%2==0){
				    i=i+2;

	                    }
			    if(arr[j]%2!=0){
				    j=j+2;
			    }
		    }
		}
	}
}
