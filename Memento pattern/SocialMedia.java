package MementoPattern;

import java.io.File;
import java.util.Stack;

/**
 * 
 * Social media is class that represent an social account in real world It has 2
 * properties profile picture and bio It acting as caretaker in MementoPattern
 */
public class SocialMedia {
	private String bio;
	private File profilePicture;
	/*
	 * Memento is class that will store originator previous snapshot
	 * */ 
	private Stack<Memento> bioHistory;
	private Stack<Memento> profileHistory;

	/*
	 *  setBio method to set the method
	 *  */
	public void setBio(String bio) {
		this.bio = bio;
		/**
		 * this push will push the memento object in memento stack
		 * **/
		bioHistory.push(new Memento(this.bio));

	}

	/**
	 *  setFile method to set the profile picture
	***/
	public void setFile(File profilePicture) {
		this.profilePicture = profilePicture;
		profileHistory.push(new Memento(this.profilePicture));

	}

	/**
	 * show profile is a method to return the profile picture of the account
	 * **/
	public File showProfile() {
		return this.profilePicture;
	}

	/*
	 *  show profile is a method to return the bio of the account
	 *  */
	public String showBio() {
		return this.bio;
	}

	/* 
	 * undo bio will remove the last snapshot of the object for bio
	 *  */
	public void undobio() {
		restoreBio(bioHistory.pop());
	}

	/* 
	 * undoprofile will remove the last snapshot of the object for profile
	 *  */
	public void undoProfile() {
		restoreProfile(profileHistory.pop());
	}

	/*
	 *  restoreBio will set the previous state of the object to current state
	 *   */
	private void restoreBio(Memento memento) {
		this.bio = memento.bio;

	}
	/* 
	 * restore profile will set the previous state of the object to current state
	 *  */

	private void restoreProfile(Memento memento) {
		this.profilePicture = memento.profilePicture;

	}
/*
 *  Memento is Memento the lock box and read by only originator class 
 *  */

	private static class Memento {
		private String bio;
		private File profilePicture;

		/* 
		 * Memento constructor for setting bio 
		 * */
		private Memento(String bio) {
			this.bio = bio;
		}

		/* 
		 * 
		 * Memento constructor for setting Profile 
		 * */
		private Memento(File profilePicture) {
			this.profilePicture = profilePicture;

		}

		/* 
		 * to return the last bio setted 
		 * */
		public String getPreviousBio() {
			return bio;
		}

       /* 
        * to return the last profile setted 
        * */
		public File getPreviousProfile() {
			return profilePicture;
		}

	}
}
