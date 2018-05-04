package FirstPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SamplMap {

	public static void main(String[] args)
	{
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		map.put(1, 100);
		map.put(20, 200);
		map.put(1, 100);
		map.put(4, 100);
		System.out.println(map.get(1));
		System.out.println(map.get(20));
		/*System.out.println(map.get(1));*/
		System.out.println(map.get(4));
		
	}
}
