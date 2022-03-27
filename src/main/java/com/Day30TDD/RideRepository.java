package com.Day30TDD;

import java.util.HashMap;

public class RideRepository {
	HashMap<Integer, Ride[]> rideRepo = new HashMap<Integer, Ride[]>();

	public HashMap<Integer, Ride[]> getRideRepo() {
		return rideRepo;
	}
}