package dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		DataDrivenClass d = new DataDrivenClass();
		@SuppressWarnings("rawtypes")
		ArrayList data = d.getData("Add Profile");
		data.forEach(a->{
			System.out.println(a);
		});
	}

}
