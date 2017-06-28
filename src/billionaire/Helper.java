package billionaire;

import java.lang.reflect.Array;

public class Helper {

	public static <E> E[] getArray(Class<E> clazz, int size) {
	    @SuppressWarnings("unchecked")
	    E[] arr = (E[]) Array.newInstance(clazz, size);

	    return arr;
	}
}
