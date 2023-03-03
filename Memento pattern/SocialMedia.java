package Pattern;

import java.io.File;
import java.util.Stack;

public class SocialMedia {
	private String bio;
	private File profilePicture;
	private Stack<Memento> bioHistory;
	private Stack<Memento> profileHistory;

	public void setBio(String bio) {
		this.bio = bio;
		bioHistory.push(new Memento(this.bio));

	}

	public void setFile(File profilePicture) {
		this.profilePicture = profilePicture;
		profileHistory.push(new Memento(this.profilePicture));
		
	}
	public File showProfile()
	{
		return this.profilePicture;
	}
	public String showBio()
	{
		return this.bio;
	}

//	private Memento saveBio() {
//		return new Memento(this.bio);
//	}

//	private Memento saveProfile() {
//		return new Memento(this.profilePicture);
//	}

	public void undobio()
	{
		restoreBio(bioHistory.pop());
	}
	public void undoProfile()
	{
		restoreProfile(profileHistory.pop());
	}
	private void restoreBio(Memento memento) {
		this.bio = memento.bio;

	}

	private void restoreProfile(Memento memento) {
		this.profilePicture = memento.profilePicture;

	}

	private static class Memento {
		private String bio;
		private File profilePicture;

		private Memento(String bio) {
			this.bio = bio;
		}

		private Memento(File profilePicture) {
			this.profilePicture = profilePicture;

		}

		public String getPreviousBio() {
			return bio;
		}

		public File getPreviousProfile() {
			return profilePicture;
		}

	}
}