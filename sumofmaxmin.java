//geeksforgeeks

class Solution
{
   public:
    int findSum(int A[], int N)
    {
    	//code here.
    	int max,min;
    	max=A[0];
    	min=A[0];
    	for(int i=0;i<N;i++){
    	    if(A[i]>max){
    	        max=A[i];
    	    }else if(A[i]<min){
    	        min=A[i];
    	    }
    	}
    	int sum=0;
    	sum=max+min;
    	return sum;
    }

};
