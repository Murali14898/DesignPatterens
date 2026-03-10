package Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentRegistry<T> {
	private Map<String,T> registryMap = new LinkedHashMap<>();
	
	public void register(T t,String key) {
		registryMap.put(key, t);
	}
	
	public T getObject(String key) {
		Student s = (Student) registryMap.get(key);
		System.out.print(s.batch);
		return (T) s.copy();
	}

}
