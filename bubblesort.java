public class bubblesort {
  public static void bubbleSort(int arr[], int n)
    {
        //code here
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
  public static void main(String[] args) {
    int arr[] = { 4, 1, 3, 9, 7 };
    bubbleSort(arr, 5);
  }
}
