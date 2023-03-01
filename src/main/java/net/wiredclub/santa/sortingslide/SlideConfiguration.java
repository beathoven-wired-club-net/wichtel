package net.wiredclub.santa.sortingslide;

public class SlideConfiguration {

	/**
	 * <pre>slide 1
	 * input : 01, 02, 03, 04
	 * c1 : 01 & 02 -> 05 & 06
	 * c2 : 03 & 04 -> 07 & 08
	 * c3 : 06 & 07 -> 09 & 10
	 * c4 : 05 & 09 -> 11 & 12
	 * c5 : 10 & 08 -> 13 & 14
	 * output : 11, 12, 13, 14</pre>
	 */
	public SlideOutput slide1(int weightOfParcel1, int weightOfParcel2, int weightOfParcel3, int weightOfParcel4) {
		SlideCrossing c1 = new SlideCrossing(weightOfParcel1, weightOfParcel2);
		SlideCrossing c2 = new SlideCrossing(weightOfParcel3, weightOfParcel4);
		SlideCrossing c3 = new SlideCrossing(c1.valueOfRightSlide(), c2.valueOfLeftSlide());
		SlideCrossing c4 = new SlideCrossing(c1.valueOfLeftSlide(), c3.valueOfLeftSlide());
		SlideCrossing c5 = new SlideCrossing(c3.valueOfRightSlide(), c2.valueOfRightSlide());

		return new SlideOutput.Builder()
				.addOutput(c4.valueOfLeftSlide())
				.addOutput(c4.valueOfRightSlide())
				.addOutput(c5.valueOfLeftSlide())
				.addOutput(c5.valueOfRightSlide())
				.build();
	}

	/**
	 * <pre>engine 2
	 * input : 01, 02, 03, 04
	 * c1 : 01 & 02 -> 05 & 06
	 * c2 : 03 & 04 -> 07 & 08
	 * c3 : 05 & 07 -> 09 & 10
	 * c4 : 06 & 08 -> 11 & 12
	 * output : 09, 10, 11, 12</pre>
	 */
	public SlideOutput slide2(int weightOfParcel1, int weightOfParcel2, int weightOfParcel3, int weightOfParcel4) {
		SlideCrossing c1 = new SlideCrossing(weightOfParcel1, weightOfParcel2);
		SlideCrossing c2 = new SlideCrossing(weightOfParcel3, weightOfParcel4);
		SlideCrossing c3 = new SlideCrossing(c1.valueOfLeftSlide(), c2.valueOfLeftSlide());
		SlideCrossing c4 = new SlideCrossing(c1.valueOfRightSlide(), c2.valueOfRightSlide());

		return new SlideOutput.Builder()
				.addOutput(c3.valueOfLeftSlide())
				.addOutput(c3.valueOfRightSlide())
				.addOutput(c4.valueOfLeftSlide())
				.addOutput(c4.valueOfRightSlide())
				.build();
	}

	/**
	 * <pre>engine 3
	 * input : 01, 02, 03, 04
	 * c1 : 01 & 04 -> 05 & 06
	 * c2 : 02 & 05 -> 07 & 08
	 * c3 : 06 & 03 -> 09 & 10
	 * c4 : 07 & 09 -> 11 & 12
	 * c5 : 08 & 10 -> 13 & 14
	 * output : 11, 12, 13, 14</pre>
	 */
	public SlideOutput slide3(int weightOfParcel1, int weightOfParcel2, int weightOfParcel3, int weightOfParcel4) {
		SlideCrossing c1 = new SlideCrossing(weightOfParcel1, weightOfParcel4);
		SlideCrossing c2 = new SlideCrossing(weightOfParcel2, c1.valueOfLeftSlide());
		SlideCrossing c3 = new SlideCrossing(c1.valueOfRightSlide(), weightOfParcel3);
		SlideCrossing c4 = new SlideCrossing(c2.valueOfLeftSlide(), c3.valueOfLeftSlide());
		SlideCrossing c5 = new SlideCrossing(c2.valueOfRightSlide(), c3.valueOfRightSlide());

		return new SlideOutput.Builder()
				.addOutput(c4.valueOfLeftSlide())
				.addOutput(c4.valueOfRightSlide())
				.addOutput(c5.valueOfLeftSlide())
				.addOutput(c5.valueOfRightSlide())
				.build();
	}

	/**
	 * <pre>engine 4
	 * input : 01, 02, 03, 04
	 * e4c1 : 01 & 02 -> 05 & 06
	 * e4c2 : 03 & 04 -> 07 & 08
	 * e4c3 : 05 & 07 -> 09 & 10
	 * e4c4 : 06 & 08 -> 11 & 12
	 * e4c5 : 10 & 11 -> 13 & 14
	 * output : 09, 13, 14, 12</pre>
	 */
	public SlideOutput slide4(int weightOfParcel1, int weightOfParcel2, int weightOfParcel3, int weightOfParcel4) {
		SlideCrossing c1 = new SlideCrossing(weightOfParcel1, weightOfParcel2);
		SlideCrossing c2 = new SlideCrossing(weightOfParcel3, weightOfParcel4);
		SlideCrossing c3 = new SlideCrossing(c1.valueOfLeftSlide(), c2.valueOfLeftSlide());
		SlideCrossing c4 = new SlideCrossing(c1.valueOfRightSlide(), c2.valueOfRightSlide());
		SlideCrossing c5 = new SlideCrossing(c3.valueOfRightSlide(), c4.valueOfLeftSlide());

		return new SlideOutput.Builder()
				.addOutput(c3.valueOfLeftSlide())
				.addOutput(c5.valueOfLeftSlide())
				.addOutput(c5.valueOfRightSlide())
				.addOutput(c4.valueOfRightSlide())
				.build();
	}

	public SlideOutput slide5(int weightOfParcel1, int weightOfParcel2) {
		SlideCrossing c1 = new SlideCrossing(weightOfParcel1, weightOfParcel2);

		return new SlideOutput.Builder()
				.addOutput(c1.valueOfLeftSlide())
				.addOutput(c1.valueOfRightSlide())
				.build();
	}
}
