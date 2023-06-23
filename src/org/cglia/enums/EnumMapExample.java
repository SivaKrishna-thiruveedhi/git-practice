package org.cglia.enums;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public class EnumMapExample {
	enum Mobile1{
		REALME, SAMSUNG, APPLE, VIVO, OPPO, MOTTO
	}
	
	public static void main(String[] args) {
		EnumMap <Mobile1 , Integer> mob = new EnumMap<>(Mobile1.class);
		mob.put(Mobile1.REALME, 15000);
		mob.put(Mobile1.SAMSUNG, 17000);
		mob.put(Mobile1.OPPO, 14000);
		mob.put(Mobile1.MOTTO, 10000);
		//in for-each
		for(Entry<Mobile1, Integer> ent : mob.entrySet())
		{
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}
		
		System.out.println("\n\n1)\t"+mob.entrySet());
		System.out.println("2)\t"+mob.containsKey(Mobile1.OPPO));
		System.out.println("3)\t"+mob.containsKey(Mobile1.APPLE));
		System.out.println("4)\t"+mob.keySet());
		System.out.println("5)\t"+mob.values());
	}
}
