package ogr.nazarov.lesson6;

public class AppMain {
    static final int SIZE=10_000_000;
    static final int HALF=SIZE/2;

    public static void main(String[] args) {
        float[] oneThreadArr = oneThread();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        float[] twoThreadArr = twoThread();
        float summOneThreadArr=0;
        float summTwoThreadArr=0;
        for (int i = 0; i <SIZE ; i++) {
            summOneThreadArr+=oneThreadArr[i];
            summTwoThreadArr+=twoThreadArr[i];
        }
        System.out.println(oneThreadArr.length + "  " + summOneThreadArr);
        System.out.println(twoThreadArr.length + "  " + summTwoThreadArr);
        System.out.println("Equality of two arrays " + (Math.abs(summOneThreadArr-summTwoThreadArr)));
    }
    public static float[] oneThread(){

        float[]arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i]=1;
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("oneThread time = "+ (System.currentTimeMillis()-start));
        return arr;
    }

    public static float[] twoThread(){
        float[]arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i]=1;
        }
        float[] oneHalf = new float[HALF];
        float[] twoHalf = new float[HALF];

        long start = System.currentTimeMillis();

        System.arraycopy(arr,0,oneHalf,0,HALF);
        System.arraycopy(arr,0,twoHalf,0,HALF);

        Thread thread1 = new Thread(()->{
                for (int i = 0; i < oneHalf.length; i++) {
                    oneHalf[i] = (float) (oneHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0,j=HALF; i < twoHalf.length; i++,j++) {
                twoHalf[i] = (float)(twoHalf[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(oneHalf,0,arr,0,HALF);
        System.arraycopy(twoHalf,0,arr,HALF,HALF);

        System.out.println("twoThread time = "+ (System.currentTimeMillis()-start));
        return arr;
    }


}
