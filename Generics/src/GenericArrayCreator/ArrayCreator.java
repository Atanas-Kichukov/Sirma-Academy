package GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator<T> {


    public static <T> T[]  create(int length,T item) throws IllegalAccessException {
        if(length<0){
            throw new IllegalAccessException("Array length cannot be negative");
        }
        T[] arr = (T[]) Array.newInstance(item.getClass(),length);
        Arrays.fill(arr,item);
        return arr;
    }

    public static <T> T[] create(Class<T> tClass,int length, T item) throws IllegalAccessException {
        if(length<0){
            throw new IllegalAccessException("Array length cannot be negative");
        }

        T[] arr = (T[]) Array.newInstance(tClass,length);
        Arrays.fill(arr,item);
        return arr;



    }

}
