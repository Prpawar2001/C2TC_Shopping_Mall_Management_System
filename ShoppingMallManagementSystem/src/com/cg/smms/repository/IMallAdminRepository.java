package com.cg.smms.repository;

import com.cg.smms.entities.MallAdmin;

public interface IMallAdminRepository {

	abstract MallAdmin addMallAdmin(MallAdmin malladmin);
	abstract MallAdmin updateMallAdmin(MallAdmin malladmin);
	abstract MallAdmin searchMallAdmin(int id);
	abstract MallAdmin deleteMallAdmin(int id);
}
