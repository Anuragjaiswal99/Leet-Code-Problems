class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(int i=0; i<moves.length(); i++){
            char path = moves.charAt(i);
            switch(path){
                case 'U':
                    y++;
                    break;
                
                case 'D':
                    y--;
                    break;

                case 'L':
                    x--;
                    break;

                case 'R':
                    x++;
                    break;
            }
        }
        return (x == 0 && y == 0);
    }
}