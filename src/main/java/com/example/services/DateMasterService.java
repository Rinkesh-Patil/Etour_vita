package com.example.services;
//import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.entities.DateMaster;

public interface DateMasterService {
	List<DateMaster> getDateMaster();
	Optional<DateMaster> getDateMaster(int id);
	void delete(int id);
	void addDate(DateMaster e);
	//void update(DateMaster date,int id);
}
