package lang.object.toString;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 변환값 출력
        System.out.println(string);

        //object 변환값 출력
        System.out.println(object);
    }
}
