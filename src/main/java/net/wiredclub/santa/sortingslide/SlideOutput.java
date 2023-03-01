package net.wiredclub.santa.sortingslide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlideOutput {

	private final List<Integer> outputValues;

	private SlideOutput(List<Integer> outputValues) {
		this.outputValues = outputValues;
	}

	public int getOutputValue(int index) {
		if (index < 0 || index >= outputValues.size()) {
			throw new IndexOutOfBoundsException();
		}
		return outputValues.get(index);
	}

	public List<Integer> getOutputValues() {
		return Collections.unmodifiableList(outputValues);
	}

	public static class Builder {

		private final List<Integer> outputValues;

		public Builder() {
			outputValues = new ArrayList<>();
		}

		public Builder addOutput(int value) {
			outputValues.add(value);
			return this;
		}

		public SlideOutput build() {
			return new SlideOutput(outputValues);
		}
	}
}
