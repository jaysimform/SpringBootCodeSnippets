package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService{
//here i have created fake list of users that we need to extract from the database.
	List<User> list=List.of(
			new User(98L, "Jay Rathod", "9512710401"),
			new User(99L, "Avinash Hargun", "9112710111"),
			new User(18L, "Jay 2", "9111111")
			);
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);//in this statement the user is a variable which would iterate through the list and get individual records
	}

}
