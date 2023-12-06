package salerecordpack;

public class program3 {
	public static void main(String[] args) {
		// Check if the correct number of arguments is provided
		if (args.length != 2) {
			System.out.println("Usage: java Program3 <CSV_FILE_PATH> <CAR_MAKE>");
			System.exit(1);
		}

		// Get CSV file path and car make from command line arguments
		String csvFilePath = args[0];
		String carMake = args[1];

		// Initialize and populate CarMakeLinkedList from CSV file
		CarMakeLinkedList carMakeList = readCSV(csvFilePath, carMake);

		// Display runtime to read records with car make
		// ...

		// Display the number of records detected for the car make
		// ...

		// Get user input for car model, start date, and end date
		String carModel = getUserInput("Enter the car model (e.g., Altima): ");
		String startDate = getUserInput("Enter the start date (e.g., 2022-08-01): ");
		String endDate = getUserInput("Enter the end date (e.g., 2022-09-10): ");

		// Create SaleRecordIterator
		SaleRecordIterator iterator = new SaleRecordIterator(carMakeList, carModel, startDate, endDate);

		// Display runtime to create iterator
		// ...

		// Calculate and display the number of records
		int recordsCount = calculateRecords(iterator);
		// Display the result
		// ...
	}

	// Method to read CSV file and populate CarMakeLinkedList
	private static CarMakeLinkedList readCSV(String filePath, String carMake) {
		// ...
		// Implement reading CSV and populating CarMakeLinkedList here
		// ...
	}

	// Method to get user input from the console
	private static String getUserInput(String prompt) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(prompt);
		return scanner.nextLine();
	}

	// Method to calculate the number of records based on the iterator
	private static int calculateRecords(SaleRecordIterator iterator) {
		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		return count;
	}
}
