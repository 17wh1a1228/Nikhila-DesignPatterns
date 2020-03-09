package com.maven.epam;

public class PersonBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person
    		  .PersonBuilder("Nikhila")
    		  .setMidName("Chowdary")
    		  .setLastName("Bikki")
    		  .build();
     System.out.println(person);
	}

}