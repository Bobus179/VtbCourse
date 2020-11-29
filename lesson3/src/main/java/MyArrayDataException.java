public class MyArrayDataException extends NumberFormatException{
    private int row;
    private int column;
    private Object object;
    public MyArrayDataException(Object s, int x, int y){
        this.object=s;
        this.row=x;
        this.column=y;
        System.out.printf("По адресу х=%d ,у=%d находится неверное значение %s.\n",row,column,object.toString());

    }
}
