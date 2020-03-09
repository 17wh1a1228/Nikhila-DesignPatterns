package com.maven.epam;

public class SingletonClass {
	public static SingletonClass instance = new SingletonClass();
	       
    public static SingletonClass getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Singleton object");   
    }
}
