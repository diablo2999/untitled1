import java.math.BigInteger;

public class main5 {

    public static BigInteger fabe(BigInteger n)
    {
        int res;
        BigInteger m=null;
        BigInteger y = new BigInteger("1");
        res=n.compareTo(y);
        if(res==0)
            return n;
        else
           m = n.subtract(BigInteger.valueOf(1));
            return n.multiply(fabe(m));

    }
    public static  void main(String arg[])
    {
        System.out.println(fabe(BigInteger.valueOf(200)));

    }
}
