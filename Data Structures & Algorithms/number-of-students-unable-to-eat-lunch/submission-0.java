class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
          int[] count = new int[2];
    int res = students.length;
    for(int s : students){
        count[s]++;
    }

    for (int s : sandwiches){
        if (count[s]>0){
            res--;
            count[s]--;
        }else {
            break;
        }
    }

    return res;

    }
}