package builder;

public class MainTest {

public static void main(String args[]) {
	
	Task task= new TaskBuilder(123).setDescription("Hello").setDone(false).setSummary("first task").build();
	
	System.out.println(task);
	
	
}

}

