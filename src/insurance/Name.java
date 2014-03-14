package insurance;

public class Name {
	private String title;
	
	public Name(String title, String initials, String surname) {
		super();
		this.title = title;
		this.initials = initials;
		this.surname = surname;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTitle() {
		return title;
	}
	private String initials;
	private String surname;
	public void setTitle(String title)
	{
		this.title=title;
	}
	@Override
	public String toString() {
		return "Name [title=" + title + ", initials=" + initials + ", surname="
				+ surname + "]";
	}
	
}
