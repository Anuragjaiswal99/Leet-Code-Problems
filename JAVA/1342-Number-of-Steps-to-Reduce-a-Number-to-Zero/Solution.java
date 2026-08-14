class Solution {
    public int numberOfSteps(int num) {

        int x = num;
        int steps = 0;
        while(x > 0){
            if(x % 2 == 0){
              x = x / 2;
              steps++;

            }else{
                x = x -1;
                steps++;
            }
        }
        return steps;
    }
}