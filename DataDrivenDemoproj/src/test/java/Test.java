import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Datadriven d = new Datadriven();
		ArrayList data =d.getData("add profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));

	}

}
