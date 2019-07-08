package wzs.cn;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(1, "王强", "123456");
		User user2 = new User(1, "李强", "123455");
		System.out.println(user == user2);
		System.out.println(user.equals(user2));
	}

}

class User{
	int id;
	String name;
	String passwd;
		
	public User(int id, String name, String passwd) {
		super();
		this.id = id;
		this.name = name;
		this.passwd = passwd;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		/*
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
			*/
		return true;
	}



	public void show() {
		System.out.println("id = " +this.id);
		System.out.println("name = " +this.name);
		System.out.println("passwd = " +this.passwd);
	}
}