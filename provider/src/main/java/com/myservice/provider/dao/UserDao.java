package com.myservice.provider.dao;


import com.myservice.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface  UserDao extends JpaRepository<User,Long> {


}
