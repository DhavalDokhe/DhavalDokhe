package Exception;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        int age =17;

        if (age<=18){
            throw new Exception("you cant vote");
        }else {
            System.out.println("you can vote");
        }
        System.out.println("hdh");
    }
}
/**      throw                                                        Throws
/*1. throw is used to throw exception.                    1.throws is used to declare exception.
/*2.throw is used in method.                              2.throws is used with method signature.
/*3.you can throw only one exception at a time.           3.you can declare multiple exception .
/*4.throw is followed by instance.                        4.throws is followed by class.
*/