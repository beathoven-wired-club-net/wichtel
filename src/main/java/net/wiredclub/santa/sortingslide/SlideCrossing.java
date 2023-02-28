package net.wiredclub.santa.sortingslide;

public class SlideCrossing {

	private final int valueOfLeftSlide;
	private final int valueOfRightSlide;

	public SlideCrossing(int valueOfLeftSlide, int valueOfRightSlide) {
		this.valueOfLeftSlide = valueOfLeftSlide;
		this.valueOfRightSlide = valueOfRightSlide;
	}

	public int valueOfLeftSlide() {
		return Math.min(valueOfLeftSlide, valueOfRightSlide);
	}

	public int valueOfRightSlide() {
		return Math.max(valueOfLeftSlide, valueOfRightSlide);
	}
}
