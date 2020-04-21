package com.obunda.cms.constant;

public enum Page {
	REGISTRATION {
		@Override
		public String toString() {
			return "user/registration";
		}
	},
	LOGIN {
		@Override
		public String toString() {
			return "user/login";
		}
	},
	ADMIN_HOME {
		@Override
		public String toString() {
			return "user/admin/home";
		}
	};
}
