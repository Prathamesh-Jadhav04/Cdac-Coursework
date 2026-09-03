
public class ContractualEmployee extends Employee {

		private float variablePay;
	public float getVariablePay() {
			return variablePay;
		}

		public void setVariablePay(float variablePay) {
			this.variablePay = variablePay;
		}

	public ContractualEmployee(int empNo, String name, float basicSalary, float variablePay) {
			super(empNo, name, basicSalary);
			this.variablePay = variablePay;
		}

	@Override
	public float processSalary() {
		float finalSalary=getBasicSalary()+variablePay;
		return finalSalary;
	}

	public ContractualEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
