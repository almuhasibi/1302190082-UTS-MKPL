package lib;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan


	public Employee(
			String employeeId,
			String firstName,
			String lastName,
			String idNumber,
			String address,
			boolean isForeigner // Primitive Obsession Bad Smell convert with enumerasi 
		) {
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = idNumber;
			this.address = address;
			this.isForeigner = isForeigner;
		}

    public Employee(String firstName2, String lastName2, String employeeId2, String address2, String foreigner) {
    }
	public Employee(boolean isForeigner) {
		this.isForeigner = isForeigner;
	}
    public String getEmployeeId() { 
		return employeeId;
	}
		/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	public String getFirstName() { 
		return firstName;
	}

	public String getLastName() { 
		return lastName;
	}

	public String getIdNumber() { 
		return idNumber;
	}

	public String getAddress() { 
		return address;
	}

	public boolean isForeigner() {
		return isForeigner;
	}

	public String getForeigner() { 
		return null;
	}
}
	