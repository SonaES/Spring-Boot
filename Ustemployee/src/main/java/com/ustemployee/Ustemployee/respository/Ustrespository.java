package com.ustemployee.Ustemployee.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ustemployee.Ustemployee.model.Ustmodel;

@Repository
public interface Ustrespository extends JpaRepository<Ustmodel,Integer>{
	
}