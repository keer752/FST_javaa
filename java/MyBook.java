package Activities;

public class MyBook  extends Book {

	@Override
	void setTitle(String title) {
		if(title != null&& !title.isEmpty()) {
		this.title=title;
		}
	}
		
	
	
	
	public static void main(String[] args) {
		MyBook mybook = new MyBook();
		mybook.setTitle("the book");
		System.out.println("Book title is :"+mybook.getTitle());
	}
	

}
