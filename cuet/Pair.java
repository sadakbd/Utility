package com.cuet;

import java.math.BigInteger;

public class Pair {
	
	BigInteger cId;
	BigInteger pId;
	
	public Pair(BigInteger cId, BigInteger pId) {
		this.cId = cId;
		this.pId = pId;
	}

	@Override
	public String toString() {
		return "Pair [cId=" + cId + ", pId=" + pId + "]";
	}
	

}
