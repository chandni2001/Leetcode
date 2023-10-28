/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n =peak(mountainArr);
        int first =search1(mountainArr,0,n,target);
        
         if(first!=-1){
            return first;
        }
        else{
           return search2(mountainArr,n+1,mountainArr.length()-1,target);
        }

        
        //return -1;
        
    }
    static int peak( MountainArray arr){
        
        int s=0;
        int e =arr.length() - 1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr.get(mid)>arr.get(mid+1)){
                e=mid;
            }
            else if(arr.get(mid)<arr.get(mid+1)){
                s = mid+1;
            }
           
        }
         return s;
    }
    static int search1(MountainArray arr,int s,int e,int target){
        while(s<=e){
            int mid =s+(e-s)/2;
            if(target>arr.get(mid)){
                s=mid+1;
            }
            else if(target<arr.get(mid)){
                e=mid-1;
            }
            else {
                return mid;
            }
            
        }
        return -1;
        
    }
    static int search2(MountainArray arr,int s,int e,int target){
        while(s<=e){
            int mid =s+(e-s)/2;
            if(target>arr.get(mid)){
                e=mid-1;
            }
            else if(target<arr.get(mid)){
                s=mid+1;
            }
            else {
                return mid;
            }
            
        }
        return -1;
        
    }
}