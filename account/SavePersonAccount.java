package com.jsp.person.account;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManagerFactory entityManagerFactory=
Persistence.createEntityManagerFactory("vikas");

EntityManager entityManager=entityManagerFactory.createEntityManager();

EntityTransaction entityTransaction=entityManager.getTransaction();

Person person=new Person();
person.setName("Dhanashree");
person.setEmail("dhanashree@mail.com");
person.setCno(930704563l);
person.setGender("Female");

Account account1=new Account();
account1.setBank_name("BOI");
account1.setAcc_no(1234567890123l);
account1.setIfsc_code("BOI12345678");

Account account2=new Account();
account2.setBank_name("SBI");
account2.setAcc_no(12345678901234l);
account2.setIfsc_code("SBI54321678");

Account account3=new Account();
account3.setBank_name("HDFC");
account3.setAcc_no(1234563245123l);
account3.setIfsc_code("HDFC432665678");

ArrayList<Account> accounts=new ArrayList<Account>();
accounts.add(account1);
accounts.add(account2);
accounts.add(account3);

//setting the person with many bank accounts
person.setAccounts(accounts);

entityTransaction.begin();
entityManager.persist(person);
entityManager.persist(account1);
entityManager.persist(account2);
entityManager.persist(account3);
entityTransaction.commit();
	}

}
