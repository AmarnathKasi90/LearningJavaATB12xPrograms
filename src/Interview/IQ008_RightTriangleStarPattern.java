package Interview;

import java.util.Scanner;

public class IQ008_RightTriangleStarPattern {
/*   ✅ Right Triangle Star Pattern
*
**
***
****
***** */

    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n;i++){
        for(int j=0;j<i;j++)
        {
            System.out.print("*");
        }
            System.out.println();
        }

    }
}
