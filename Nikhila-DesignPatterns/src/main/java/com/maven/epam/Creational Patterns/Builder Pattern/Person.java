package com.maven.epam;
public class Person{

	private int id;
	private String firstName;
	private String lastName;
	private String midName;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", midName=" + midName + "]";
	}
	private Person(PersonBuilder personBuilder) {
		this.id=personBuilder.id;
		this.firstName=personBuilder.firstName;
		this.lastName=personBuilder.lastName;
		this.midName=personBuilder.midName;
	}
	public static class PersonBuilder{
		private int id;
		private String firstName;
		private String lastName;
		private String midName;
		
		
		public PersonBuilder(String firstName) {
			super();
			this.firstName = firstName;
		}
		public int getId() {
			return id;
		}
		public PersonBuilder setId(int id) {
			this.id = id;
			return this;
		}
		public String getFirstName() {
			return firstName;
		}
		public PersonBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public String getLastName() {
			return lastName;
		}
		public PersonBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public String getMidName() {
			return midName;
		}
		public PersonBuilder setMidName(String midName) {
			this.midName = midName;
			return this;
		}
		public Person build()
		{
			return new Person(this);
		}
	}
}
