package Pattern;

import java.io.File;
import java.util.Stack;

public class MementoPattern {
public static void main(String[] args) {
	SocialMedia newAccount=new SocialMedia();
	

	File file = new File("path");
	newAccount.setFile(file);
    newAccount.setBio("hai this is new account");
    System.out.println(newAccount.showBio());
    newAccount.setBio("changed state");
    System.out.println(newAccount.showBio());
    newAccount.undobio();
    
    System.out.println(newAccount.showBio());
	
}
}
