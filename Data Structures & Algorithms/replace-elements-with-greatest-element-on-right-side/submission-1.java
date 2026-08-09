class Solution {
   public int[] replaceElements(int[] arr) {
    int n = arr.length;
    int rightMax = -1;

    for (int i = n-1; 0 <= i ; i--) {
        if (arr[i] > rightMax){
            int t = arr[i];
            arr[i] = rightMax;
            rightMax = t;
            continue;
        }else {
            arr[i] = rightMax;
        }

    }
    return arr;
}
}