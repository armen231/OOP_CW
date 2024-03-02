package FitnessCalculator.FitnessCalculatorMaven;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import FitnessCalculator.FitnessCalculatorMaven.Classes.BodyMassIndex;
import FitnessCalculator.FitnessCalculatorMaven.Classes.PulseZone;



/**
 * <b>Класс реализующий тестирование методов BodyMassIndexResult и PulseZoneResult класса clases.</b>
 * @author Мовсесян Армен Саргисович
 * @version 1.0
 * В классе 2 метода сравнивающие требуемые и реальные выходные данные.
 * Классы используют библиотеку java.util.ArrayList, org.junit.Assert, org.junit.Test.
 */

public class ClassesTest {
	/**
	 * Метод создающий объект класса свходными параметрами и сравнивающий требуемые и реальные выходные данные.
	 */
	
	@Test
	public void BodyMassIndexResult() {
		BodyMassIndex BodyMassIndex = new BodyMassIndex(1.8,85);
		ArrayList<String> List1 = new ArrayList<String>();
		ArrayList<String> List2 = new ArrayList<String>();
		List1 = BodyMassIndex.BodyMassIndexResult();
		List2.add("26,2");
		List2.add("Избыточная масса тела (предожирение)");
		assertEquals(List2, List1);
	}

	/**
	 * Метод создающий объект класса свходными параметрами и сравнивающий требуемые и реальные выходные данные.
	 */
	@Test
	public void PulseZoneResult() {
		PulseZone PulseZone = new PulseZone(25);
		ArrayList<String> List1 = new ArrayList<String>();
		ArrayList<String> List2 = new ArrayList<String>();
		List1 = PulseZone.PulseZoneResult();
		List2.add("98 - 117");
		List2.add("117 - 137");
		List2.add("137 - 156");
		List2.add("156 - 176");
		List2.add("176 - 195");
		List2.add("195");
		assertEquals(List2, List1);
	}
}
