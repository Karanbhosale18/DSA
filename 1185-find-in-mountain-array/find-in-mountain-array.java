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
    
        int mid=peakElementInArray(mountainArr);
        
        int ans=binarySerachAss(mountainArr,0,mid,target);
        if(ans!=-1){
            return ans;
        }
        int ans2=binarySerachDes(mountainArr,mid+1,mountainArr.length()-1,target);
        if(ans2!=-1){
            return ans2;
        }
        return -1;
    }

    public int peakElementInArray(MountainArray m){
            int start=0;
            int end=m.length()-1;

            while(end>start){
                int mid=start+(end-start)/2;

                if(m.get(mid)>m.get(mid+1)){
                    end=mid;
                }else if(m.get(mid)<m.get(mid+1)){
                    start=mid+1;
                }
            }
        return start;
    } 

    public int binarySerachAss(MountainArray m,int start,int end,int t){
            while(end>=start){
                int mid=start+(end-start)/2;

                if(m.get(mid)>t){
                    end=mid-1;
                }else if(m.get(mid)<t){
                    start=mid+1;
                }else{
                    return mid;
                }
            }
        return -1;
    } 

    public int binarySerachDes(MountainArray m,int start,int end,int t){
            while(end>=start){
                int mid=start+(end-start)/2;

                if(m.get(mid)>t){
                    start=mid+1;
                }else if(m.get(mid)<t){
                    end=mid-1;
                }else{
                    return mid;
                }
            }
        return -1;
    } 
}