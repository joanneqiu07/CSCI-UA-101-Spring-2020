package qiu.MAIN;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import qiu.FACTORIES.StormtrooperFactory;
import qiu.STORMTROOPERS.*;

public class QiuExam{


	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		String fn = "/Users/janeqiu/eclipse-workspace"
				+ "/QiuNYUFinalExamSpring2020/src/RawDataFiles/StormtrooperData";
		String sn = "/Users/janeqiu/eclipse-workspace"
				+ "/QiuNYUFinalExamSpring2020/src/SerializedDataFiles/STStorage";
		ArrayList<Stormtrooper> st1 = StormtrooperFactory.buildStormtroopers(fn);
		StormtrooperFactory.displayStormtroopers(st1, 3);
		System.out.println();
		STOfficer so = (STOfficer)st1.get(0);
		System.out.println();
		so.displayCarriedItems();
		System.out.println();
		StormtrooperFactory.storeStormtroopers(st1, sn);
		ArrayList<Stormtrooper> st2 = StormtrooperFactory.retrieveStormtroopers(sn);
		System.out.println();
		System.out.println("The total number of Stormtrooper retrieved is " + st2.size());
		STNonOfficer sno = (STNonOfficer) st2.get(2);
		System.out.println();
		sno.displayCarriedItems();

	}

}
