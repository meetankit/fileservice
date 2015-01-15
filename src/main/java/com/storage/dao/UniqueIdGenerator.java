package com.storage.dao;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class UniqueIdGenerator {
	private static SecureRandom randomGenerator = new SecureRandom();
	private static Object timeStampLock = new Object();
	private static Set<Long> used = new HashSet<Long>();
	private static long lastTimeStamp = 0L;

	public static long generate(int systemId) {
		if ((systemId < 0) || (systemId > 255)) {
			throw new IllegalArgumentException(
					"System Id has to be in range [0, 255]");
		}
		long currentTime;
		long id;
		synchronized (timeStampLock) {
			do {
				currentTime = System.currentTimeMillis() / 1000L;
				if (currentTime != lastTimeStamp) {
					used.clear();
				}
				id = merge(randomGenerator.nextInt(), (int) currentTime,
						(byte) systemId);
			} while (used.contains(Long.valueOf(id)));

			used.add(Long.valueOf(id));
			lastTimeStamp = currentTime;
		}
		return id;
	}

	private static long merge(int random, int timeStamp, byte id) {
		long result = random & 0x7FFFFF;
		result <<= 32;
		result |= timeStamp & 0xFFFFFFFF;
		result <<= 8;
		result |= id & 0xFF;
		return result;
	}
}
