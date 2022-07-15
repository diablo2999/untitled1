import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class main {

    public static  void main(String arg[])
    {
        Person ss= Person.getInstance();
        ss.print();
       
    }

    static class Person{

        private  static Person  s =new  Person();

        private Person() {
        }

        public static Person getInstance(){
            return s;
        }

        public void print()
        {
            System.out.println("test");
        }
    }
}
