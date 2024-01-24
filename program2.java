import java.util.*;
class NextGreaterDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		NextGreaterDemo obj=new NextGreaterDemo();
		System.out.println("Enter array1 size:");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enter array1 elements");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter array2 size:");
		int size1=sc.nextInt();
		int arr2[]=new int[size1];
		System.out.println("Enter array2 elements");
		for(int j=0;j<arr2.length;j++){
			arr2[j]=sc.nextInt();
		}
		System.out.println("Output is :");
		int arr[]=obj.fun(arr1,arr2);
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
	int[] fun(int arr1[],int arr2[]){
		int arr3[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			int max=arr1[i];
			arr3[i]=-1;
			int index=-1;
			for(int k=0;k<arr2.length;k++){
				if(max==arr2[k]){
					index=k;
					break;
				}
			}
			for(int j=index+1;j<arr2.length;j++){
				if(max<arr2[j]){
					arr3[i]=arr2[i];
					break;
				}
			}
		}
		return arr3;
	}
}
