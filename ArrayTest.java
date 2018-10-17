import java.util.ArrayList;
public class ArrayTest {
    public static void main(String[] args) {
//
//        int array[] = {0,1,2,3,4};
//        array[2]= 1;
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println(array[i]);
//        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,2);
        arrayList.add(1,3);
        arrayList.add(2,4);
        arrayList.add(3,5);
        arrayList.add(4,26);
        arrayList.add(2,992);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        //        System.out.println(arrayList.get());

        //    int[] array = new int[args.length];
//    int j=0;
//    for(String s:args){
//        int i = Integer.parseInt(s);
//        array[j] =i;
////            System.out.println(array[j]);
//    }
//    for (int i = 0; i <array.length ; i++) {
//        System.out.println(array[i]);
//        }



        //    Integer array[] = new Integer[10];
//
//
////    array[-1] =4;
//
//    array[0] =0;
//    array[1] =1;
//    array[2] =22;
//    array[3] =3;
//    array[4] =4;

//        array[2].
//        int end = -1;
//        for (int i = 0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }

//        array[2] = 2;
//        for (int i = 0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }

//        System.out.println("Value at 2"+array[2]);
//        if(array[2] == 22){
//            array[2] = 2;
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[i]);
//            }
//        }
//        else
//            array[2] = array[2];
//    }
//

    }

}