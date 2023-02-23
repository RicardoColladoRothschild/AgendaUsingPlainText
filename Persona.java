public class Persona{

	private int age;
	private String name;
	private int id;
	private String phone;


		/*
		* The constructor method for the class Persona, is the one that will build the class with the
		* person information
		* @param age is for the age of the person
		* @param name is the name of the person
		* @param id is for the id that will be use later to save the files name
		* @param phone is a string variable that might hold only numbers represent in a string, or with dash (-) characters. 
		* @author ricardo vladimir collado rothschild, email ricardocolladorothschild@gmail.com

		*/
		public Persona(int age, String name, int id, String phone){

				this.age= age;
				this.name = name;
				this.id = id;
				this.phone = phone;
		}

		public int getAge(){
			return this.age;
		}

		public String getName(){
			return this.name;
		}

		public int getId(){
			return this.id;
		}

		public void setName(String name){
			this.name = name;
		}

		public void setAge(int age){
			this.age = age;
		}

		public void setId(int id){
			this.id = id;
		}

		public void setPhone(String phone){
			this.phone = phone;
		}

		public String getPhone(){
			return this.phone;
		}


		@Override
			public String toString(){
				return this.getName() + "/" + this.getAge() + "/" + this.getId() + "/" + this.getPhone();
			}
}