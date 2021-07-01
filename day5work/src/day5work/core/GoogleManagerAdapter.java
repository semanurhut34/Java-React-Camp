package day5work.core;

import day5work.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{
	
	@Override
	public void signInWithGoogle() {
		
		GoogleManager googleManager = new GoogleManager();
		googleManager.sign(); 
		
	}



}
