package org.cglia.uuid;

import java.util.UUID;

class UUIDvariantExample {
	public static void main(String arg[]) throws UnsupportedOperationException {
		UUID uuid = UUID.fromString("c81d4e2e-bcf2-11e6-869b-7df92533d2db");
		UUID uuid1 = UUID.fromString("5289df73-7df5-3326-fcdd-22597afb1fac");
		System.out.println("UUID variant is: " + uuid.variant()); // returns variant number
		System.out.println("UUID variant is: " + uuid1.variant());
	}
}