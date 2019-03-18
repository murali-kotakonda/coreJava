package innerEx;

 
interface service {
	void process();
}

class Annonymous3 {
	public static void main(String args[]) {
		service s = new service() {
			@Override
			public void process() {
				System.out.println("Data processed");
			}
		};
		s.process();
	}
}