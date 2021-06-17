import java.util.Scanner;
class RORAsRPS
{
    public static void main(int rounds)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of rounds you want to play");
        int num = rounds;
        System.out.println("enter (r)ock, (p)aper or (s)cissor");
        String comp;
        int c=0, p=0, co=0;
        for(int i=1;i<num+1;i++)
        {
            System.out.println("_____\nRound:"+i);
            String player = sc.nextLine();
            double n = Math.random();
            if(n>0.0 && n<=0.33)
                comp = "Rock";
            else if(n>0.33 && n<=0.66)
                comp = "Paper";
            else
                comp = "Scissor";
            switch(player)
            {
                case "r":
                if(comp == "Rock")
                {
                   System.out.println("Computer:Rock\nPlayer:Rock\nDraw!!\n_____");
                }
                else if(comp == "Paper")
                {
                   c--;
                   co++;
                   System.out.println("Computer:Paper\nPlayer:Rock\nComputer Won!!\n_____");
                }
                else
                {
                   c++;
                   p++;
                   System.out.println("Computer:Scissor\nPlayer:Rock\nPlayer Won!!\n_____");
                }
                break;
            
                case "p":
                if(comp == "Rock")
                {
                   c++;
                   p++;
                   System.out.println("Computer:Rock\nPlayer:Paper\nPlayer Won!!\n_____");
                }
                else if(comp == "Paper")
                {
                   System.out.println("Computer:Paper\nPlayer:Paper\nDraw!!\n_____");
                }
                else
                {
                   c--;
                   co++;
                   System.out.println("Computer:Scissor\nPlayer:Paper\nComputer Won!!\n_____");
                }
                break;
            
                case "s":
                if(comp == "Rock")
                {
                    c--;
                    co++;
                   System.out.println("Computer:Rock\nPlayer:Scissor\nComputer Won!!\n_____");
                }
                else if(comp == "Paper")
                {
                   c++;
                   p++;
                   System.out.println("Computer:Paper\nPlayer:Scissor\nPlayer Won!!\n_____");
                }
                else
                {
                   System.out.println("Computer:Scissor\nPlayer:Scissor\nDraw!!\n_____");
                }
                break;
            }
        }
        System.out.println("Final Score:"+co+":"+p);
        if(c>0)
        {
            System.out.println("Player's lead:"+c);
            System.out.println("Player Won the series");
        }
        else if(c<0)
        {
            c = c*-1;
            System.out.println("Computer's lead:"+c);
            System.out.println("Computer Won the series");
        }
        else
        {
            System.out.println("Series Draw");
        }
    }
}
        
        