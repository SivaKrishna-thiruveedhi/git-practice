package org.cglia.uuid;

import java.util.UUID;

class UUIDVersionExample {
	public static void main(String arg[]) throws UnsupportedOperationException {
//returns a UUID with specified value  
		UUID uuid = UUID.fromString("c81d4e2e-bcf2-21e6-869b-7df92533d2db");
		UUID uuid1 = UUID.fromString("5289df73-7df5-5326-bcdd-22597afb1fac");
		System.out.println("UUID version is: " + uuid.version()); // invoking version method
		System.out.println("UUID version is: " + uuid1.version());
	}
}