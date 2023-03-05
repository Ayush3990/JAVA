public class Expressions{
    public static void main(String[]args){
     int highScore = myScore(true,10000,1000,8);
     System.out.println("Your final Score is "+highScore);
     System.out.println("Your Final Score is "+ myScore(true,20000,1000,8));
    }
    public static int myScore(boolean gameOver,int score,int levelCompleted,int bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted*bonus);
        }
        return finalScore;
    }
} 
