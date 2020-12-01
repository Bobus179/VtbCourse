public class AppMain {
    public static void main(String[] args) {
        String [][] strings = new String[][]{
                {"1","2","3","4"},
                {"5","6","7git","8"},
                {"9","10","11","12"},
                {"13","14","15","16"}
        };
        try {
            System.out.println(arrSum(strings));
        }catch (MyException e){
            e.printStackTrace();
        }


    }

    public static int arrSum(String[][] arr){

        int maxRows=4;//строки
        int maxColumns=4;//столбцы
        int arrSum=0;
        if (arr.length!=maxColumns){
            throw  new MyArraySizeException();
        }
        for (int i=0;i<maxColumns;i++){
            for (int j=0;j<maxRows;j++){
                if (arr[j].length!=maxRows){
                    throw  new MyArraySizeException();
                }
                try {
                    arrSum+=Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException nfe){
                    throw new MyArrayDataException(arr[i][j],i,j);
                }
            }
        }
        return arrSum;
    }
}
