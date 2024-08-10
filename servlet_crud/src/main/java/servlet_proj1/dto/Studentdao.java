package servlet_proj1.dto;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import antlr.collections.List;
import servlet_proj1.dao.Studentdto;

public class Studentdao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public String insert(Studentdto studentdto){
		entityTransaction.begin();
		entityManager.persist(studentdto);
		entityTransaction.commit();
		
		
		
		return "successfully data is inserted";
		
	}
	
	public Studentdto findbyid(int id){ 
		Studentdto studentdto=entityManager.find(Studentdto.class, id);
		return studentdto;
		
	}
	
	
	public java.util.List<Studentdto> findAll(){ 
		//Syntax for JPQL-->select variable_name from Tablename/Entityname variable_name
		Query q= entityManager.createQuery("select s from Studentdto s"); 
		//JPQL -->(java persistence queary language)--->It supports all the ORM(object relational mapping) like hibernate, Toplink etc... but we need to change the dependencies
		java.util.List<Studentdto> list=q.getResultList();
		return list;
		
	}
	
	
	
	public String deletebyid(int id){
		Studentdto studentdto=entityManager.find(Studentdto.class, id);
		
		if(studentdto!=null){
			entityTransaction.begin();
			entityManager.remove(studentdto);
			entityTransaction.commit();
			return "Data is deleted";
		}
		else{
			return "Data not found";
			
		}
	}
	
	public String deleteAll(){
		Query q=entityManager.createQuery("select a from Studentdto a");
		java.util.List<Studentdto> list=q.getResultList();
		
		if(list.isEmpty()){
			return "data not found";
			
		}else{
			
			for(Studentdto b:list){
				entityTransaction.begin();
				entityManager.remove(b);
				entityTransaction.commit();
			}
			return "data is deleted";
		}
		
	
		
	}
	
	
	public String updateById(int id){
		
		Studentdto studentdto=entityManager.find(Studentdto.class, id);
		if(studentdto!=null){
		studentdto.setGender("Male");
		entityTransaction.begin();
		entityManager.merge(studentdto);
		entityTransaction.commit();
		return "updated successfully";
		}
		else 
			return "no data found";
		
		
	}

	public String update(Studentdto studentdto) {
		entityTransaction.begin();
		entityManager.merge(studentdto);
		entityTransaction.commit();
		
		
		
		return "data updated successfully";
		
	}

	

}
