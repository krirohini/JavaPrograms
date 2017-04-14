package com.common.programs;

public class NumberToDozens {

	class DozensUnit {
		private int dozens;
		private int leftOver;

		public DozensUnit(int dozens, int leftOver) {
			super();
			this.dozens = dozens;
			this.leftOver = leftOver;
		}

		public int getDozens() {
			return dozens;
		}

		public void setDozens(int dozens) {
			this.dozens = dozens;
		}

		public int getLeftOver() {
			return leftOver;
		}

		public void setLeftOver(int leftOver) {
			this.leftOver = leftOver;
		}
	}

	public DozensUnit convertIntoDozens(int number)
			throws IllegalArgumentException {
		DozensUnit dozensUnit = new DozensUnit(0, 0);
		if (number < 0) {
			throw new IllegalArgumentException(
					"Invalid Value.....Please Enter a Positive Value");
		} else {
			dozensUnit.setDozens(number / 12);
			dozensUnit.setLeftOver(number % 12);
		}
		return dozensUnit;
	}

	public static void main(String[] args) {

		System.out.println("Please Enter any integer value");

		try {

			int num = Integer.parseInt(args[0]);

			NumberToDozens numberToDozens = new NumberToDozens();
			DozensUnit convertIntoDozens = numberToDozens.convertIntoDozens(num);

			System.out.print("Number of Dozens are..... ");
			System.out.print(convertIntoDozens.getDozens());
			System.out.print(" and left overs are.... ");
			System.out.println(convertIntoDozens.getLeftOver());
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		}
	}

}
