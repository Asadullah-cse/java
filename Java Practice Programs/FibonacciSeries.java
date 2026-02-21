public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0, b=1, c, i=3;
        int num=10;

        if(num==1){
            System.out.print(a);
        }

        if (num>=2) {
            System.out.print(a+" ");
            System.out.print(b+" ");

            while(i<=num){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
                i++;
            }
        }
    }
}
