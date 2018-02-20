package com.niit.TechLibBackEnd.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
	@Entity
	public class Supplier {
		
		@Id
		public String sId;
		private String sName;
		public String getsId() {
			return sId;
		}
		public void setsId(String sId) {
			this.sId = sId;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}

	}


