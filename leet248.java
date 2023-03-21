public class leet248 {
    //duplicate number
    public static void main(String[] args){
        int[] arr={1,3,4,4,2};
        int num= cyclic(arr);
        System.out.println(num);
    }
    static int cyclic(int[] arr){

        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
             i++;    
            }
           
        }
       
       return arr[arr.length-1];
    }

}
    

