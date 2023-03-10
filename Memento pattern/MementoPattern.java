package MementoPattern;

import java.io.File;
import java.util.Stack;

public class MementoPattern {
public static void main(String[] args) {
	/**
	 * creating a newAccount */
	SocialMedia newAccount=new SocialMedia();
	

	File file = new File("path");
	/*
	 * setting bio and profile for a account using setters
	 * **/
	
	newAccount.setFile(file);
    newAccount.setBio("hai this is new account");
    /*
     * showing the details**/
    System.out.println(newAccount.showBio());
    /*
     * changing the details of bio **/
    newAccount.setBio("changed state");
    /*
     * showing the details after changing**/
    System.out.println(newAccount.showBio());
    /*
     * using undobio to change method to revert the change and get previous state of the object**/
    newAccount.undobio();
    
    System.out.println(newAccount.showBio());
	
}
}
