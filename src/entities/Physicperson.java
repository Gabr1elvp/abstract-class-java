package entities;

public class Physicperson extends Taxpayers {

	private Double h_expenditures;

	public Physicperson() {
	}

	public Physicperson(String name, Double income, Double h_expenditures) {
		super(name, income);
		this.h_expenditures = h_expenditures;

	}

	public Physicperson(String name, Double income) {
		super(name, income);

	}

	public Double getH_expenditures() {
		return h_expenditures;
	}

	public void setH_expenditures(Double h_expenditures) {
		this.h_expenditures = h_expenditures;
	}

	@Override
	public Double taxCalculation() {

		if (getIncome() <= 20000 && h_expenditures == 0) {

			return getIncome() * 0.15;

		}

		else if (getIncome() <= 20000 && h_expenditures > 0) {

			return getIncome() * 0.15 - h_expenditures * 0.5;

		}

		else if (h_expenditures == 0) {

			return getIncome() * 0.20;

		}

		else if (h_expenditures > 0) {

			return getIncome() * 0.20 - h_expenditures * 0.5;

		}

		return getIncome();
	}

	public String toString() {

		return getName() + ": $" + String.format(" %.2f", taxCalculation());

	}

}
