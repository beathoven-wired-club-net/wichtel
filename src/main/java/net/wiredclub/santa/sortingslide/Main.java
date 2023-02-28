package net.wiredclub.santa.sortingslide;

public class Main {

	private static final int FREDI = 39;
	private static final int OSWALD = 34;
	private static final int IPHIS = 28;
	private static final int ESMERALDA = 21;

	public static void main(String[] args) {
		SlideConfiguration slideConfiguration = new SlideConfiguration();

		SlideOutput slideOutput = slideConfiguration.slide1(IPHIS, ESMERALDA, FREDI, OSWALD);
		System.out.println("Slide 1 (IPHIS, ESMERALDA, FREDI, OSWALD): " +
				slideOutput.getOutputValue1() + ", " +
				slideOutput.getOutputValue2() + ", " +
				slideOutput.getOutputValue3() + ", " +
				slideOutput.getOutputValue4());

		slideOutput = slideConfiguration.slide1(OSWALD, FREDI, ESMERALDA, IPHIS);
		System.out.println("Slide 1 (OSWALD, FREDI, ESMERALDA, IPHIS): " +
				slideOutput.getOutputValue1() + ", " +
				slideOutput.getOutputValue2() + ", " +
				slideOutput.getOutputValue3() + ", " +
				slideOutput.getOutputValue4());

		slideOutput = slideConfiguration.slide2(IPHIS, ESMERALDA, FREDI, OSWALD);
		System.out.println("Slide 2 (IPHIS, ESMERALDA, FREDI, OSWALD): " +
				slideOutput.getOutputValue1() + ", " +
				slideOutput.getOutputValue2() + ", " +
				slideOutput.getOutputValue3() + ", " +
				slideOutput.getOutputValue4());

		slideOutput = slideConfiguration.slide2(OSWALD, FREDI, ESMERALDA, IPHIS);
		System.out.println("Slide 2 (OSWALD, FREDI, ESMERALDA, IPHIS): " +
				slideOutput.getOutputValue1() + ", " +
				slideOutput.getOutputValue2() + ", " +
				slideOutput.getOutputValue3() + ", " +
				slideOutput.getOutputValue4());

		slideOutput = slideConfiguration.slide3(IPHIS, ESMERALDA, FREDI, OSWALD);
		System.out.println("Slide 3 (IPHIS, ESMERALDA, FREDI, OSWALD): " +
				slideOutput.getOutputValue1() + ", " +
				slideOutput.getOutputValue2() + ", " +
				slideOutput.getOutputValue3() + ", " +
				slideOutput.getOutputValue4());

		slideOutput = slideConfiguration.slide3(OSWALD, FREDI, ESMERALDA, IPHIS);
		System.out.println("Slide 3 (OSWALD, FREDI, ESMERALDA, IPHIS): " +
				slideOutput.getOutputValue1() + ", " +
				slideOutput.getOutputValue2() + ", " +
				slideOutput.getOutputValue3() + ", " +
				slideOutput.getOutputValue4());

		slideOutput = slideConfiguration.slide4(IPHIS, ESMERALDA, FREDI, OSWALD);
		System.out.println("Slide 4 (IPHIS, ESMERALDA, FREDI, OSWALD): " +
				slideOutput.getOutputValue1() + ", " +
				slideOutput.getOutputValue2() + ", " +
				slideOutput.getOutputValue3() + ", " +
				slideOutput.getOutputValue4());

		slideOutput = slideConfiguration.slide4(OSWALD, FREDI, ESMERALDA, IPHIS);
		System.out.println("Slide 4 (OSWALD, FREDI, ESMERALDA, IPHIS): " +
				slideOutput.getOutputValue1() + ", " +
				slideOutput.getOutputValue2() + ", " +
				slideOutput.getOutputValue3() + ", " +
				slideOutput.getOutputValue4());
	}
}
