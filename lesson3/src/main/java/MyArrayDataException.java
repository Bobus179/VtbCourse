public class MyArrayDataException extends MyException{

    public MyArrayDataException(String s, int x, int y){
        super("По адресу х="+x+ ",у="+y+" находится неверное значение - "+s);

    }
}
