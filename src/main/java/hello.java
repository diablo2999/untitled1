public class hello
{
    public native int helloWorld(int x, int y);
    public static void main(String[] args) {
        System.loadLibrary("Dll5");
        hello t = new hello();
        int mm = t.helloWorld(1000000,10000000);
        System.out.println(mm);
    }
}