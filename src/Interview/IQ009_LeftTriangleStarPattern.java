package Interview;

public class IQ009_LeftTriangleStarPattern {
/* ✅ Left Triangle Star Pattern
*****
****
***
**
*
*/
public static void main(String[] args) {
    int n = 5;
    for(int i=1; i<=n;i++){
        for(int j=n-i; j >=0;j--){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
