package com.locktrust.pos.Utils;

public class Utils {

	public static enum CouponType {
		Flat, Percentage
	};

	public static enum CouponBasedOn {
		Quantity, Time, QuantityAndTime
	}

	public static enum ProductType {
		Product(1), Modifier(2), ModifierGroup(3), Bundle(4);

		private int val;

		private ProductType(int val) {
			this.val = val;
		}

		public int getVal() {
			return val;
		}

	}

}
