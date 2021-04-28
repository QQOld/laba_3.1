package Base.classes;

import Base.interfacce.Accum;

public class Multiplication implements Accum {
    public int fold(int[] arr) {
        int res = 1;
        for(int i = 0; i < arr.length; i++) {
            res *= arr[i];
        }
        return res;
    }
}
