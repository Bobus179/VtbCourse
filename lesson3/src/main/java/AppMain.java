public class AppMain {
    public static void main(String[] args) {
        String [][] strings = new String[][]{
                {"1","2","3","4"},
                {"5","6","7w","8"},
                {"9","10","11","12"},
                {"13","14","15","16"}
        };
        try {
            System.out.println(arrSum(strings));
        }catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }


    }

    public static int arrSum(String[][] arr)throws MyArraySizeException,MyArrayDataException{
//        MyArraySizeException s;
//        MyArrayDataException d;
        int maxRows=4;//строки
        int maxColumns=4;//столбцы
        int arrSum=0;
        if (arr.length!=maxColumns){
            MyArraySizeException s1 = new MyArraySizeException();
            return 0;
        }
        for (int i=0;i<maxColumns;i++){
            for (int j=0;j<maxRows;j++){
                if (arr[j].length!=maxRows){
                    MyArraySizeException s2 = new MyArraySizeException();
                    return 0;
                }
                try {
                    arrSum+=Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException nfe){
                    MyArrayDataException d=new MyArrayDataException(arr[i][j],i,j);
                    return 0;
                }

            }
        }
        return arrSum;
    }
}
