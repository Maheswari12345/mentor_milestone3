package com.mentor.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mentor.model.*;

public interface Userdao extends JpaRepository<User,Integer>{

}
