package com.contact.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list=List.of(
			new Contact(1L,"amit@gmail.com","Amit", 98L),
			new Contact(2L,"anil@gmail.com","Anil", 18L),
			new Contact(3L,"jam@gmail.com","Jen", 99L),
			new Contact(4L,"jack@gmail.com","jack", 98L)
			
			);
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
