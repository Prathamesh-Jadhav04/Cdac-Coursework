
public class Training {
	public String moduleName;
	private int duration;
	
		public Training(){
	}

		public Training(String moduleName, int duration) {
			super();
			this.moduleName = moduleName;
			this.duration = duration;
		}

		public Training(int duration, String moduleName) {
			super();
			this.duration = duration;
			this.moduleName = moduleName;
		}

		public String getModuleName() {
			return moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}
		public void conductTraing() { } //this is empty implementation....!
		
		public String getDetails() {
			String details = "Module:- "+moduleName+"\nDuration (days):- "+duration;
			return details;
		}
		
}
