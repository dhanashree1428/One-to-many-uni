package com.jsp.hospital.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManagerFactory entityManagerFactory=
Persistence.createEntityManagerFactory("vikas");

EntityManager entityManager=entityManagerFactory.createEntityManager();

EntityTransaction entityTransaction=entityManager.getTransaction();

Hospital hospital=new Hospital();
hospital.setName("TATA");
hospital.setEmail("tata@mail.com");
hospital.setLocation("Mumbai");

Branch branch1=new Branch();
branch1.setName("OPD");
branch1.setFloor("2th");

Branch branch2=new Branch();
branch2.setName("OT");
branch2.setFloor("4th");

Branch branch3=new Branch();
branch3.setName("IP");
branch3.setFloor("5th");

ArrayList<Branch> branches=new ArrayList<Branch>();
branches.add(branch3);
branches.add(branch2);
branches.add(branch1);

hospital.setBranchs(branches);

entityTransaction.begin();
entityManager.persist(hospital);
entityManager.persist(branch1);
entityManager.persist(branch2);
entityManager.persist(branch3);
entityTransaction.commit();
}

}
