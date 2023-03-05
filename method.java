public class method {
    public static void main(String[]args){
    int highScore = calculateHighScorePosition(1500);
    displayHighScorePosition("Ayush",highScore);

    }
    public static void displayHighScorePosition(String name,int rank){
       System.out.println(name + " managed to get in position " + rank + " on the high score list.");
    }
    public static int calculateHighScorePosition(int score){
        int finalScore = 4 ;
        if(score>=1000){
            finalScore = 1;
        }
        else if (score >= 500 ){
            finalScore = 2;
        }
        else if (score >=100 ){
            finalScore = 3;
        }
           return finalScore;
    }

    
}
