class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;
        for(int x : bills){
            if( x == 5){
                five++;
            }
            if(x==10){
                if(five <1){
                    return false;
                }
                ten++;
                five--;
            }
            if(x==20){
                if ((five < 3) && (five <1 || ten <1)){
                    return false;
                }
                if (ten < 1){
                    five -= 3;
                }else{
                    five--;
                ten --;

                }
                
            }
        }
        return true;
       
    }
}