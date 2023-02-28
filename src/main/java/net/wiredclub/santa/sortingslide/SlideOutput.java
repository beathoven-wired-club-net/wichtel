package net.wiredclub.santa.sortingslide;

public class SlideOutput {

	private final int outputValue1;
	private final int outputValue2;
	private final int outputValue3;
	private final int outputValue4;

	public SlideOutput(int outputValue1, int outputValue2, int outputValue3, int outputValue4) {
		this.outputValue1 = outputValue1;
		this.outputValue2 = outputValue2;
		this.outputValue3 = outputValue3;
		this.outputValue4 = outputValue4;
	}

	public int getOutputValue1() {
		return outputValue1;
	}

	public int getOutputValue2() {
		return outputValue2;
	}

	public int getOutputValue3() {
		return outputValue3;
	}

	public int getOutputValue4() {
		return outputValue4;
	}
}
