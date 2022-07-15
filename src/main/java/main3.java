import java.math.BigInteger;
import java.util.Scanner;

public class main3 {

    public BigInteger getRowNum(){
        BigInteger result ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入杨辉三角总层数：");
        result = BigInteger.valueOf(200);
        return result;
    }

    public BigInteger[][] printYangHui(){
        BigInteger rowNum = this.getRowNum();
//        二维数组定义
        BigInteger[][] erweiList = new BigInteger[rowNum.intValue()][];
        for(int i = 0;i <= rowNum.intValue()-1; i++){
            erweiList[i] = new BigInteger[i+1];
            for(int j = 0;j <= i; j++){
                if(j == 0 || j == erweiList[i].length - 1){
                    erweiList[i][j] = BigInteger.valueOf(1);
                }
                else {
                    erweiList[i][j] = erweiList[i-1][j-1].add(erweiList[i-1][j]);
                }
            }
        }
        return erweiList;
    }

    public static void main(String[] args) {
        main3 YangHui = new main3();
        BigInteger[][] result = YangHui.printYangHui();
        for (BigInteger[] ints : result) {
            for (BigInteger anInt : ints) {
                System.out.print(anInt);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}