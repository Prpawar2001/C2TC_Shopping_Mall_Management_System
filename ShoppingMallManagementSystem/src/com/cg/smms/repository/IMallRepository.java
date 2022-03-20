package com.cg.smms.repository;

import com.cg.smms.entities.Mall;

public interface IMallRepository {

	abstract Mall addMall(Mall mall);
	abstract Mall updateMall(Mall mall);
	abstract Mall searchMall(int id);
	
}
