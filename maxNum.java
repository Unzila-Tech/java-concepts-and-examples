public class maxNum {
     public static void maxIndex(int arr[]){
             int max=arr[0];
            int index=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                    index=i;
                }
                
            }
            System.out.println("max array element "+max);
             System.out.println("index "+index);
     }
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       maxIndex(arr);
     }
}
