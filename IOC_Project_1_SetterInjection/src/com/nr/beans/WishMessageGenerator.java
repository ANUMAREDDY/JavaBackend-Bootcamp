package com.nr.beans;

import java.util.Date;

public class WishMessageGenerator {

		private Date date;
		
		public WishMessageGenerator() {
			System.out.println("0-param constructor");
		}
		 
		public void setDate(Date date) {
			System.out.println("setDate initialization");
			this.date=date;
		}
		//b.method
		
		public String generateWishMessage(String user) {
			System.out.println("generateWishMessage() ");
			int hour=date.getHours();
			if(hour<12)
				return "GM::"+user;
			else if(hour<16)
				return "GA::"+user;
			else if(hour<20)
				return "GE::"+user;
			else
				return "GN::"+user;
		}
		

	}

