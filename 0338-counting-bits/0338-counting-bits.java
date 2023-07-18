class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int i=0;
        while(i<=n){
            String str = Integer.toBinaryString(i);
            long n1=Long.parseLong(str);
            long num=n1;
            long sum=0;
            while(num>0){
                long r=num%10;
                sum=sum+r;
                num=num/10;
            }
            arr[i]=(int)sum;
            i++;
        }
        return arr;
        
    }
}