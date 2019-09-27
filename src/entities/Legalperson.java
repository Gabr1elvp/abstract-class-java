package entities;

public class Legalperson extends Taxpayers {

	private Integer n_workers;

	public Legalperson(Integer n_workers, String name, Double income) {
		super(name, income);
		this.n_workers = n_workers;

	}

	public Integer getN_workers() {
		return n_workers;
	}

	public void setN_workers(Integer n_workers) {
		this.n_workers = n_workers;
	}

	public Double taxCalculation() {

		if (n_workers < 10) {

			return getIncome() * 0.16;
		}

		else {

			return getIncome() * 0.14;
		}

	}

	public String toString() {

		return getName() + ": $" + String.format(" %.2f", taxCalculation());

	}

}
