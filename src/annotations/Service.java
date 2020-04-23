package annotations;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Service {

	@MethodInfo(author = "kumar", comments = "Main method", date = "Nov 17 2012", revision = 1)
	public String process() {
		return "Overriden toString method";
	}

	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@Override
	public String toString() {
		return "MethodInfoUse []";
	}

}