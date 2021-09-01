
package programsequencethirdquestion;


public class ProgramSequenceThirdQuestion 
{
    public static void main(String[] args) {
        int i,j,c;
        System.out.println("Series is : ");
        for (i=1;i<11;i++)
        {
            c=1;
            for (j=1;j<=i;j++)
            {
                c=c*i;
            }
            System.out.println(c);
        }

    }
    
}
