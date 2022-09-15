package in.co.rays.sorting.interfac;

public class Marksheet implements Comparable<Marksheet> {
	
		private String rollNo;
		private String fName;
		private String lName;
		private int phy;
		private int chem;
		private int math;

		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		public int getPhy() {
			return phy;
		}
		public void setPhy(int phy) {
			this.phy = phy;
		}
		public int getChem() {
			return chem;
		}
		public void setChem(int chem) {
			this.chem = chem;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		
		public Marksheet() {}
		public String getRollno() {
			return rollNo;
		}
		
		@Override
		public int compareTo(Marksheet m) {
			// TODO Auto-generated method stub
			return this.rollNo.compareTo(m.rollNo);
		}
}
