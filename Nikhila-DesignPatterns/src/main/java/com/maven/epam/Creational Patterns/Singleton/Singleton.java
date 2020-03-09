package com.maven.epam;

public class Singleton {
	public static void main(String[] args) {
        SingletonClass sc = SingletonClass.getInstance();
        sc.showMessage();
    }
}
